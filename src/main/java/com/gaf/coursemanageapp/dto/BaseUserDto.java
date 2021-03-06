package com.gaf.coursemanageapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class BaseUserDto {
    private  String userName;
    private String name;
    private  String email;
    private String password;
}
