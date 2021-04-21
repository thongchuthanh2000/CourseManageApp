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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


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

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public AdminDTO findByUserName(String userName) {
        Admin admin= adminRepository.findByUserName(userName);
        AdminDTO  adminDTO = mapper.map(admin, (Type) AdminDTO.class);
        return adminDTO;
    }

    @Override
    public void update(AdminDTO admin) {
        Admin oldAdmin=  adminRepository.findByUserName(admin.getUserName());

        oldAdmin.setName(admin.getName());
        oldAdmin.setEmail(admin.getEmail());
        adminRepository.save(oldAdmin);
    }


    public List<AdminDTO> findAll(){
        List<Admin> admins= adminRepository.findAll();
        List<AdminDTO>  adminDto = mapper.map(admins, (Type) AdminDTO.class);
        return adminDto;
    }

    @Override
    public void save(AdminDTO adminDTO) {
        Admin admin = mapper.map(adminDTO,Admin.class);
        adminRepository.save(admin);
    }



}
