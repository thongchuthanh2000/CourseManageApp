package com.gaf.coursemanageapp;

import com.gaf.coursemanageapp.constant.SystemConstant;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class CoursemanageappApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursemanageappApplication.class, args);
    }


//    @Bean
//    CommandLineRunner init() {
//
//        return args -> {
//
//
////            if (role.equals(SystemConstant.ADMIN_ROLE)) {
////
////                newAdminRole.setRole("ADMIN");
////                roleRepository.save(newAdminRole);
////            }
//
//
//        };
//
//    }
}

