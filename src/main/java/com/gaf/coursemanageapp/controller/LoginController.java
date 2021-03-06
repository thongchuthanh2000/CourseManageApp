package com.gaf.coursemanageapp.controller;

import com.gaf.coursemanageapp.authentication.AuthenticationRequest;
import com.gaf.coursemanageapp.authentication.AuthenticationResponse;
import com.gaf.coursemanageapp.constant.SystemConstant;
import com.gaf.coursemanageapp.service.impl.UserDetailsServiceImpl;
import com.gaf.coursemanageapp.user.AdminUser;
import com.gaf.coursemanageapp.user.TraineeUser;
import com.gaf.coursemanageapp.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.function.Predicate;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @Autowired
    private UserDetailsServiceImpl userAdminDetailsService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String getTest(){
        return "TangYuCheng";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest
                                                       )
            throws Exception {
        String role =authenticationRequest.getRole();
        Predicate<String> checkRole = x->{
            if (x.equals(SystemConstant.ADMIN_ROLE)||
                x.equals(SystemConstant.TRAINEE_ROLE)||
                x.equals(SystemConstant.TRAINER_ROLE)){
                SystemConstant.USER = role;
            }
            return false;
        };

        if (!checkRole.test(role)){
            throw new Exception("Incorrect ROLE");
        }

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        }
        catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }


        final UserDetails userDetails = userAdminDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
