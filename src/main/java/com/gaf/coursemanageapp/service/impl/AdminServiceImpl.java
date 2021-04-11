package com.gaf.coursemanageapp.service.impl;

import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.repository.AdminRepository;
import com.gaf.coursemanageapp.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminRepository adminRepository;


    public List<Admin> findAll(){
        return adminRepository.findAll();
    }

    public  void save(Admin admin){
        adminRepository.save(admin);
    }

}
