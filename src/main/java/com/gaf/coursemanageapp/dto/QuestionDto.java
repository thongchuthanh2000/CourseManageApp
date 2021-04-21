package com.gaf.coursemanageapp.dto;

import com.gaf.coursemanageapp.entity.Feedback;
import com.gaf.coursemanageapp.entity.Topic;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuestionDto {
    private Integer questionID;
    private Topic topic;
    private  String questionContent;
    private  boolean isDeleted;
    private Collection<Feedback> feedbacks;
}
