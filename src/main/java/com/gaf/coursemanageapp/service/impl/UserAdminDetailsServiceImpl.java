package com.gaf.coursemanageapp.service.impl;

import com.gaf.coursemanageapp.details.UserAdminDetails;
import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.repository.AdminRepository;
import com.gaf.coursemanageapp.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserAdminDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin =adminRepository.findByUserName(username);

        if (CommonUtils.isEmpty(admin)){
            throw new UsernameNotFoundException("Could not find user");
        }

        return new UserAdminDetails(admin);
    }
}
