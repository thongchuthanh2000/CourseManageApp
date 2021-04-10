package com.gaf.coursemanageapp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import java.util.Date;

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
