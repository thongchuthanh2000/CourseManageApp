package com.gaf.coursemanageapp.controller;


import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.service.IAdminService;
import com.gaf.coursemanageapp.service.impl.AdminServiceImpl;
import org.slf4j.Logger;
//import org.springframework.security.authentication.AuthenticationManager;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/admin")
public class AdminController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private IAdminService adminService;

    @GetMapping(value = "/", produces = "application/json")
    @PreAuthorize("@appAuthorizer.authorize(authentication, 'VIEW', this)")
    public Admin getAdmin(){
//        return  adminService.findAdminByUserName("cheng");
        return  adminService.findByUserName("cheng");
    }

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
