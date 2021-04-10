package com.gaf.coursemanageapp.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {
    @Id
    private Integer feedbackID;

    private  String title;

    @ManyToOne
    private Admin admin;
    private boolean isDeleted = false;

    @ManyToOne

    @EqualsAndHashCode.Exclude
    private TypeFeedback typeFeedback;
}
