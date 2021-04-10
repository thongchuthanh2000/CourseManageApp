package com.gaf.coursemanageapp.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Admin {
    @Id
    private String userName;
    private String name;
    private String email;
    private String password;


}