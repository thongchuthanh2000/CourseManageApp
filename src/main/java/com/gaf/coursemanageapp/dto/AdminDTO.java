package com.gaf.coursemanageapp.dto;

import com.gaf.coursemanageapp.validator.CheckID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AdminDTO {
    private String userName;
    private String name;
    private String email;
    private String password;
}