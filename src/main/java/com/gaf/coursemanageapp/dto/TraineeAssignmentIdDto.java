package com.gaf.coursemanageapp.dto;

import com.gaf.coursemanageapp.entity.Assignment;
import com.gaf.coursemanageapp.entity.Trainee;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data

public  class TraineeAssignmentIdDto {
    private Assignment assignment;
    private Trainee trainee;
}