package com.gaf.coursemanageapp.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TypeFeedback {
    @Id
    private Integer typeID;

    @Column(length = 50)
    private String typeName;

    private  boolean isDeleted;
}
