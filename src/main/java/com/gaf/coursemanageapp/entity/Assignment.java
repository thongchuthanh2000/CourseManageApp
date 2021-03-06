package com.gaf.coursemanageapp.entity;


import com.gaf.coursemanageapp.user.TraineeUser;
import lombok.*;
import org.apache.tomcat.jni.Address;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.RowId;

import javax.persistence.*;
import java.util.Collection;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table
@AssociationOverrides({

        @AssociationOverride(name = "primaryKey.class",
                joinColumns = @JoinColumn(name = "classID")),
        @AssociationOverride(name = "primaryKey.trainer",
                joinColumns = @JoinColumn(name = "trainerID",referencedColumnName = "username")),
        @AssociationOverride(name = "primaryKey.module",
                joinColumns = @JoinColumn(name = "moduleID")),
})
public class Assignment{
    @EmbeddedId
    TraineeWithID primaryKey = new TraineeWithID();

    private TraineeWithID getPrimaryKey(){
        return primaryKey;
    }
    @Transient
    public Class getmClass() {
        return getPrimaryKey().getMClass();
    }
    public void setmClass(Class mClass) {
        getPrimaryKey().setMClass(mClass);
    }

    @Transient
    public Module getModule() {
        return getPrimaryKey().getModule();
    }
    public void setModule(Module module) {
        getPrimaryKey().setModule(module);
    }

    @Transient
        public Trainee getTrainee() {
        return getPrimaryKey().getTrainee();
    }
    public void setTrainee(Trainee trainee) {
        getPrimaryKey().setTrainee(trainee);
    }


    @Column(length = 50, nullable = false, unique = true)
    private String registrationCode;

}

