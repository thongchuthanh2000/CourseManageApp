package com.gaf.coursemanageapp.user;



public interface BaseUser<T>  {

    void setUser(T user);

    String getPassword();

    String getUserName();
}
