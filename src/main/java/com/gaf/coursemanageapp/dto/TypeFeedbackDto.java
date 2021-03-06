package com.gaf.coursemanageapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TypeFeedbackDto {
    private Integer typeID;
    private String typeName;
    private  boolean isDeleted;
}
