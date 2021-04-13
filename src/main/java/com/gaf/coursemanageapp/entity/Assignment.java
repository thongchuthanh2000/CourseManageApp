package com.gaf.coursemanageapp.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.apache.tomcat.jni.Address;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table
@AssociationOverrides({

        @AssociationOverride(name = "primaryKey.class",
                joinColumns = @JoinColumn(name = "classID")),
        @AssociationOverride(name = "primaryKey.trainer",
                joinColumns = @JoinColumn(name = "trainerID")),
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





//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    // Quan hệ n-n với đối tượng ở dưới (Person) (1 địa điểm có nhiều người ở)
//    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
//    @ToString.Exclude // Khoonhg sử dụng trong toString()
//    @JoinTable(name = "trainee_Assignment", //Tạo ra một join Table tên là ""
//            joinColumns = @JoinColumn(name = "registrationCode"),  // TRong đó, khóa ngoại chính là  trỏ tới class hiện tại ()
//            inverseJoinColumns = @JoinColumn(name = "traineeID") //Khóa ngoại thứ 2 trỏ tới thuộc tính ở dưới
//    )
//
//    private Collection<TraineeUser> trainees;

}

