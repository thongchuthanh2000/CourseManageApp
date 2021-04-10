package com.gaf.coursemanageapp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Class {
    @Id
    private String classID;
    private String className;
    private String capacity;
    private Date startTime;
    private Date endTime;
    private boolean isDeleted = false;
}
