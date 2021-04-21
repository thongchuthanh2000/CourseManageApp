package com.gaf.coursemanageapp.dto;

import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.entity.Feedback;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ModuleDTO {
    private Integer moduleID;
    private Admin admin;
    private String moduleName;
    private Date startTime;
    private Date endTime;
    private boolean isDeleted;
    private Timestamp feedbackStartTime;
    private Timestamp feedbackEndTime;
    private Feedback feedback;
}
