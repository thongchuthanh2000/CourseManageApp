package com.gaf.coursemanageapp.service;

import com.gaf.coursemanageapp.dto.AdminDTO;
import com.gaf.coursemanageapp.entity.Admin;

import java.util.List;

public interface IAdminService {
    List<AdminDTO> findAll();
    void save(Admin admin);
    Admin findByUserName(String userName);

}
