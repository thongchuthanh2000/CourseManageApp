package com.gaf.coursemanageapp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer topicID;

    @Column(length = 255)
    private String topicName;

}
