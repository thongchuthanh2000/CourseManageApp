package com.gaf.coursemanageapp.user;

public class Trainee implements BaseUser{
    Trainee trainee;
    @Override
    public Object getUser() {
        return trainee;
    }

    @Override
    public String getPassword() {
        return trainee.getPassword();
    }

    @Override
    public String getUserName() {
        return trainee.getUserName();
    }
}
