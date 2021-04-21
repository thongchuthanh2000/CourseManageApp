package com.gaf.coursemanageapp.service;

import com.gaf.coursemanageapp.dto.AdminDto;

import java.util.List;

public interface IAdminService {
    List<AdminDto> findAll();
    void save(AdminDto admin);
    AdminDto findByUserName(String userName);
    void update(AdminDto admin);

}
