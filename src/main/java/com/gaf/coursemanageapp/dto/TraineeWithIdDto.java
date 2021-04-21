package com.gaf.coursemanageapp.dto;

import com.gaf.coursemanageapp.entity.Class;
import com.gaf.coursemanageapp.entity.Module;
import com.gaf.coursemanageapp.entity.Trainee;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public  class TraineeWithIdDto {
    private Class mClass;
    private Module module;
    private Trainee trainee;
}