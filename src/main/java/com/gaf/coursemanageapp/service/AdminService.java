package com.gaf.coursemanageapp.service;

import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;


    public List<Admin> findAll(String userName){
        return adminRepository.findAll();
    }
}
