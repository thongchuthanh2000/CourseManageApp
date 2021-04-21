package com.gaf.coursemanageapp.dto;

import com.gaf.coursemanageapp.entity.BaseUserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrainerDto extends BaseUserDto {
    private String phone;
    private String address;
    private boolean isActive;
    private Integer idSkill;
    private String activationCode;
    private String resetPasswordCode;
    private boolean isReceiveNotification;
}
