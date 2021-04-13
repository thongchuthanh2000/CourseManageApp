package com.gaf.coursemanageapp.service.impl;

import com.gaf.coursemanageapp.constant.SystemConstant;
import com.gaf.coursemanageapp.details.BaseUserDetails;
import com.gaf.coursemanageapp.repository.AdminRepository;
import com.gaf.coursemanageapp.repository.TraineeRepository;
import com.gaf.coursemanageapp.user.BaseUser;
import com.gaf.coursemanageapp.user.UserFactory;
import com.gaf.coursemanageapp.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private  BaseUser baseUser;


    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private TraineeRepository traineeRepository;

    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        baseUser = UserFactory.getUser(SystemConstant.USER);

        switch (SystemConstant.ADMIN_ROLE) {

            case SystemConstant
                    .ADMIN_ROLE:
                baseUser.setUser(adminRepository.findByUserName(username));
                break;
            case SystemConstant
                    .TRAINEE_ROLE:
                baseUser.setUser(traineeRepository.findByUserName(username));
                break;


        }
        if (CommonUtils.isEmpty(baseUser)){
            throw new UsernameNotFoundException("Could not find user");
        }

        return new BaseUserDetails(baseUser);
    }

}
