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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @Autowired
    private UserDetailsServiceImpl userAdminDetailsService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)
            throws Exception {

        String role =authenticationRequest.getRole();
//        switch (role) {
//
//            case SystemConstant
//                    .ADMIN_ROLE:
//                SystemConstant.USER = SystemConstant.ADMIN_ROLE;
//                break;
//            case SystemConstant
//                    .TRAINEE_ROLE:
//                SystemConstant.USER = SystemConstant.TRAINEE_ROLE;
//                break;
//
//
//            default:
//                throw new Exception("Incorrect ROLE");
//        }

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
