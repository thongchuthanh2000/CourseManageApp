package com.gaf.coursemanageapp.user;

import com.gaf.coursemanageapp.entity.Admin;

public class AdminUser implements BaseUser {

    Admin admin;
    @Override
    public Object getUser() {
        return admin;
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
