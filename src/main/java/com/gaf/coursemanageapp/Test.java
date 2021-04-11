package com.gaf.coursemanageapp;

import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.service.IAdminService;
import com.gaf.coursemanageapp.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


public class Test {
    public static void main(String[] args){


        AdminServiceImpl service = new AdminServiceImpl();

        Admin admin = new Admin("thaolp","thao","12","1234");
        service.save(admin);
    }
}
