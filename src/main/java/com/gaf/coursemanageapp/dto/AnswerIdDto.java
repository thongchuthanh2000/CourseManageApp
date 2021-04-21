package com.gaf.coursemanageapp.dto;

import com.gaf.coursemanageapp.entity.Class;
import com.gaf.coursemanageapp.entity.Module;
import com.gaf.coursemanageapp.entity.Question;
import com.gaf.coursemanageapp.entity.Trainee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AnswerIdDto {
    private Class mClass;
    private Module module;
    private Trainee trainee;
    private Question question;
}
