package com.gaf.coursemanageapp.controller;


import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.service.impl.AdminServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/admin")
public class AdminController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AdminServiceImpl adminService;

    @GetMapping(path = "/", produces = "application/json")
    @PreAuthorize("@appAuthorizer.authorize(authentication, 'VIEW', this)")
    public Admin getAdmin(){
        return  null;
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    @PreAuthorize("{@appAuthorizer.authorize(authentication, 'INSERT', this)}")

    public ResponseEntity<Object> addAdmin(@RequestBody Admin admin){
        adminService.save(admin);
        return  null;
    }

}
