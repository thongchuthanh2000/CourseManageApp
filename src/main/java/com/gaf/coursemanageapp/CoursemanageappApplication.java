package com.gaf.coursemanageapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableJpaRepositories
public class CoursemanageappApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursemanageappApplication.class, args);
    }

}
