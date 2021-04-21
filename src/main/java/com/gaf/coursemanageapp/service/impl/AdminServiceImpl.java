package com.gaf.coursemanageapp.service.impl;

import com.gaf.coursemanageapp.dto.AdminDTO;
import com.gaf.coursemanageapp.entity.Admin;

import com.gaf.coursemanageapp.entity.Class;
import com.gaf.coursemanageapp.repository.AdminRepository;
import com.gaf.coursemanageapp.service.IAdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private  ModelMapper mapper;

    Admin admin;

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public AdminDTO findByUserName(String userName) {
        Admin admin= (Admin) adminRepository.findByUserName(userName);
        AdminDTO  adminDTO = mapper.map(admin, (Type) AdminDTO.class);
        return adminDTO;
    }


    public List<AdminDTO> findAll(){
        List<Admin> admins= adminRepository.findAll();
        List<AdminDTO>  adminDto = mapper.map(admins, (Type) AdminDTO.class);
        return adminDto;
    }
    public  void save(Admin admin){
        adminRepository.save(admin);
    }


}
