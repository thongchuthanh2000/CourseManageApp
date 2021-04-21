package com.gaf.coursemanageapp.service;

import com.gaf.coursemanageapp.dto.AdminDTO;
import com.gaf.coursemanageapp.entity.Admin;

import java.util.List;

public interface IAdminService {
    List<AdminDTO> findAll();
    void save(AdminDTO admin);
    AdminDTO findByUserName(String userName);
    void update(AdminDTO admin);

}
