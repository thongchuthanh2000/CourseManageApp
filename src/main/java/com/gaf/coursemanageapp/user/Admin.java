package com.gaf.coursemanageapp.user;

public class Admin implements BaseUser {

    @Override
    public Object getUser() {
        return new com.gaf.coursemanageapp.entity.Admin();
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUserName() {
        return null;
    }
}
