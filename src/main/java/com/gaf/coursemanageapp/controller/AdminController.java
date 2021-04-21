package com.gaf.coursemanageapp.controller;

import com.gaf.coursemanageapp.dto.AdminDTO;
import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.service.IAdminService;

import com.gaf.coursemanageapp.user.AdminUser;
import com.gaf.coursemanageapp.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "/admin")
public class AdminController {


    @Autowired
    private IAdminService adminService;

    @PostMapping(value = "/loadProfile")
    public AdminDTO getAdmin(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();

        return  adminService.findByUserName(userDetails.getUsername());
    }


    @PutMapping(value = "/updateProfile")
    public boolean updateAdmin(@RequestBody AdminDTO adminDTO){

        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();


        try{
            if (adminDTO.getUserName().equals(userDetails.getUsername())){
                adminService.update(adminDTO);
                return true;
            }
        }
        catch (Exception exception){

        }
        return  false;
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
