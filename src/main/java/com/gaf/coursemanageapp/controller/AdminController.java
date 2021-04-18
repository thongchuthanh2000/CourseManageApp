package com.gaf.coursemanageapp.controller;

import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.service.IAdminService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "/admin")
public class AdminController {


    @Autowired
    private IAdminService adminService;

    @GetMapping(value = "/loadprofile/{username}")
//    @PreAuthorize("hasAuthority(d)")
    public Admin getAdmin(@PathVariable("username") String username){


        return  adminService.findByUserName(username);
    }



//    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
//    @PreAuthorize("{@appAuthorizer.authorize(authentication, 'INSERT', this)}")
//
//    public ResponseEntity<Object> addAdmin(@RequestBody AdminUser admin){
//        adminService.save(admin);
//        return  null;
//    }


//    @PostMapping("/login")
//    public ResponseEntity login(@RequestBody AdminUser admin) {
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
