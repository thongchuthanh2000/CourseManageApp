package com.gaf.coursemanageapp.dto;


import com.gaf.coursemanageapp.entity.Class;
import com.gaf.coursemanageapp.entity.Module;
import com.gaf.coursemanageapp.entity.Trainee;
import com.gaf.coursemanageapp.entity.TraineeWithID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class TraineeCommentDto {
    TraineeWithIdDto primaryKey = new TraineeWithIdDto();

    private  TraineeWithIdDto getPrimaryKey(){
        return primaryKey;
    }
    public Class getmClass() {
        return getPrimaryKey().getMClass();
    }
    public void setmClass(Class mClass) {
        getPrimaryKey().setMClass(mClass);
    }

    public Module getModule() {
        return getPrimaryKey().getModule();
    }
    public void setModule(Module module) {
        getPrimaryKey().setModule(module);
    }
    public Trainee getTraine() {
        return getPrimaryKey().getTrainee();
    }
    public void setTrainee(Trainee trainee) {
        getPrimaryKey().setTrainee(trainee);
    }



    private String comment;
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
