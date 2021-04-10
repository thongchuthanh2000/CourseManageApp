package com.gaf.coursemanageapp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
public class Trainer extends BaseUserEntity{

    private boolean isReceiveNotification;

}
