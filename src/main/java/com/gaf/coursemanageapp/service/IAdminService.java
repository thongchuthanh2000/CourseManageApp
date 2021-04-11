package com.gaf.coursemanageapp.service;

import com.gaf.coursemanageapp.entity.Admin;

import java.util.List;

public interface IAdminService {
    public List<Admin> findAll();
    public void save(Admin admin);
    public  Admin findByUserName(String userName);
}
