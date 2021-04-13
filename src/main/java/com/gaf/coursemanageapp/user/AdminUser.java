package com.gaf.coursemanageapp.user;

import com.gaf.coursemanageapp.entity.Admin;

public class AdminUser implements BaseUser<Admin> {

    Admin admin;


    @Override
    public void setUser(Admin user) {
        this.admin = user;
    }

    @Override
    public String getPassword() {
        return admin.getPassword();
    }

    @Override
    public String getUserName() {
        return admin.getUserName();
    }
}
