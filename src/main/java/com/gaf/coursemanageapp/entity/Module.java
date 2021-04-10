package com.gaf.coursemanageapp.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;


@Data
@Entity
public class Module {
    @Id
    private Integer moduleID;

    @ManyToOne
    private Admin admin;

    @Column(length = 50)
    private String moduleName;

    private Date startTime;
    private Date endTime;

    private boolean isDeleted;

    private Timestamp feedbackStartTime;
    private Timestamp feedbackEndTime;

    @ManyToOne
    private Feedback feedback;

}
