package com.gaf.coursemanageapp.entity;


import com.gaf.coursemanageapp.validator.CheckID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Admin extends BaseUserEntity{
}
