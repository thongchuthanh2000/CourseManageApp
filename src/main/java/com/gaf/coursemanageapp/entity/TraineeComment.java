package com.gaf.coursemanageapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "trainee_Comment")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.class",
                joinColumns = @JoinColumn(name = "classID")),
        @AssociationOverride(name = "primaryKey.trainee",
                joinColumns = @JoinColumn(name = "traineeID")),
        @AssociationOverride(name = "primaryKey.module",
                joinColumns = @JoinColumn(name = "moduleID")),
})
public class TraineeComment{
    @EmbeddedId
    TraineeWithID primaryKey = new TraineeWithID();

    private  TraineeWithID getPrimaryKey(){
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
    public Trainee getTraine() {
        return getPrimaryKey().getTrainee();
    }
    public void setTrainee(Trainee trainee) {
        getPrimaryKey().setTrainee(trainee);
    }



    @Column(length = 255)
    private String comment;
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}

