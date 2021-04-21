package com.gaf.coursemanageapp.dto;

import com.gaf.coursemanageapp.entity.Trainee;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClassDto {
    private String classID;
    private String className;
    private String capacity;
    private Date startTime;
    private Date endTime;
    private boolean isDeleted = false;
    private Collection<Trainee> trainees;
}
