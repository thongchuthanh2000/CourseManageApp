package com.gaf.coursemanageapp.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data

public class BaseUserEntity {
    @Id
    private  String userName;

    private String name;
    private  String email;
    private String phone;
    private String address;

    private boolean isActive = true;
    private String password;
    private Integer idSkill;
    private String activationCode;
    private String resetPasswordCode;
}
