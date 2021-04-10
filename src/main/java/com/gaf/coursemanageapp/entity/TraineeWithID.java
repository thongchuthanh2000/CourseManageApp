package com.gaf.coursemanageapp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Embeddable
public  class TraineeWithID implements java.io.Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classID")
    private Class mClass;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "moduleID")
    private Module module;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "traineeID")
    private Trainee trainee;

}