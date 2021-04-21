package com.gaf.coursemanageapp.dto;

import com.gaf.coursemanageapp.entity.Assignment;
import com.gaf.coursemanageapp.entity.Trainee;
import com.gaf.coursemanageapp.entity.TraineeAssignmentID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TraineeAssignmentDto {
    TraineeAssignmentIdDto primaryKey = new TraineeAssignmentIdDto();

    private  TraineeAssignmentIdDto getPrimaryKey(){
        return primaryKey;
    }

    @Transient
    public Assignment getAssignment() {
        return getPrimaryKey().getAssignment();
    }
    public void setAssignment(Assignment assignment) {
        getPrimaryKey().setAssignment(assignment);
    }

    @Transient
    public Trainee getTraine() {
        return getPrimaryKey().getTrainee();
    }
    public void setTrainee(Trainee trainee) {
        getPrimaryKey().setTrainee(trainee);
    }


}