package com.gaf.coursemanageapp.controller;


//import com.gaf.coursemanageapp.configs.JwtTokenProvider;
import com.gaf.coursemanageapp.constant.SystemConstant;
import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.models.AuthenticationRequest;
import com.gaf.coursemanageapp.models.AuthenticationResponse;
import com.gaf.coursemanageapp.service.IAdminService;
import com.gaf.coursemanageapp.service.impl.UserAdminDetailsServiceImpl;
import com.gaf.coursemanageapp.utils.JwtUtil;
import com.gaf.coursemanageapp.utils.Role;
//import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @Autowired
    private IAdminService adminService;

    @Autowired
    private UserAdminDetailsServiceImpl userAdminDetailsService;

    @GetMapping(value = "/")
    public Admin getAdmin(){
        return  adminService.findByUserName("tangyucheng");
    }



    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)
            throws Exception {
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


//    @SuppressWarnings("rawtypes")
//    @PostMapping("/login")
//    public ResponseEntity login(@RequestBody AuthBody data) {
//        try {
//            String username = data.getUser();
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, data.getPassword()));
//            String token = jwtTokenProvider.createToken(username, (Set<Role>) new Role(SystemConstant.ADMIN_ROLE));
//            Map<Object, Object> model = new HashMap<>();
//
//            model.put("username", username);
//            model.put("token", token);
//            return ok(model);
//        } catch (AuthenticationException e) {
//            throw new BadCredentialsException("Invalid email/password supplied");
//        }
//    }


//    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
//    @PreAuthorize("{@appAuthorizer.authorize(authentication, 'INSERT', this)}")
//
//    public ResponseEntity<Object> addAdmin(@RequestBody Admin admin){
//        adminService.save(admin);
//        return  null;
//    }


//    @PostMapping("/login")
//    public ResponseEntity login(@RequestBody Admin admin) {
//        try {
//            String username = admin.getUserName();
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, data.getPassword()));
//            String token = jwtTokenProvider.createToken(username, this.users.findByEmail(username).getRoles());
//            Map<Object, Object> model = new HashMap<>();
//            model.put("username", username);
//            model.put("token", token);
//            return ok(model);
//        } catch (AuthenticationException e) {
//            throw new BadCredentialsException("Invalid email/password supplied");
//        }
//    }

}
