package com.gaf.coursemanageapp.dto;

import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.entity.Question;
import com.gaf.coursemanageapp.entity.TypeFeedback;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FeedbackDto {
    private Integer feedbackID;
    private  String title;
    private Admin admin;
    private boolean isDeleted;
    private TypeFeedback typeFeedback;
    private Collection<Question> questions;
}