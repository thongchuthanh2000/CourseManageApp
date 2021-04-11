package com.gaf.coursemanageapp.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Admin {
    @Id
    private String userName;
    private String name;
    private String email;
    private String password;


}
