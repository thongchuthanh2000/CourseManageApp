package com.gaf.coursemanageapp.dto;


import com.gaf.coursemanageapp.entity.*;
import com.gaf.coursemanageapp.entity.Class;
import com.gaf.coursemanageapp.entity.Module;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnswerDto {
    AnswerIdDto primaryKey = new AnswerIdDto();

    private  AnswerIdDto getPrimaryKey(){
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

