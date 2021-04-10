package com.gaf.coursemanageapp.entity;


import javax.persistence.*;

@Entity
@Table
@AssociationOverrides({

        @AssociationOverride(name = "primaryKey.class",
                joinColumns = @JoinColumn(name = "classID")),
        @AssociationOverride(name = "primaryKey.trainer",
                joinColumns = @JoinColumn(name = "trainerID")),
        @AssociationOverride(name = "primaryKey.module",
                joinColumns = @JoinColumn(name = "moduleID")),
        @AssociationOverride(name = "primaryKey.question",
                joinColumns = @JoinColumn(name = "questionID")),
})
public class Answer{
    @EmbeddedId
    AnswerID primaryKey = new AnswerID();

    private  AnswerID getPrimaryKey(){
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
    public Trainer getTrainer() {
        return getPrimaryKey().getTrainer();
    }
    public void setTrainer(Trainer trainer) {
        getPrimaryKey().setTrainer(trainer);
    }

    @Transient
    public Question getQuestion() {
        return getPrimaryKey().getQuestion();
    }
    public void setQuestion(Question question) {
        getPrimaryKey().setQuestion(question);
    }


    private Integer value;
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

