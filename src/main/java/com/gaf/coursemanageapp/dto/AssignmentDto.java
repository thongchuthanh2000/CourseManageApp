package com.gaf.coursemanageapp.dto;

import com.gaf.coursemanageapp.entity.Class;
import com.gaf.coursemanageapp.entity.Module;
import com.gaf.coursemanageapp.entity.Trainee;
import com.gaf.coursemanageapp.entity.TraineeWithID;
import com.gaf.coursemanageapp.user.TraineeUser;
import lombok.*;
import org.apache.tomcat.jni.Address;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.RowId;

import javax.persistence.*;
import java.util.Collection;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssignmentDto {
    TraineeWithIdDto primaryKey = new TraineeWithIdDto();

    private TraineeWithIdDto getPrimaryKey(){
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


    public Trainee getTrainee() {
        return getPrimaryKey().getTrainee();
    }
    public void setTrainee(Trainee trainee) {
        getPrimaryKey().setTrainee(trainee);
    }

    private String registrationCode;

}

