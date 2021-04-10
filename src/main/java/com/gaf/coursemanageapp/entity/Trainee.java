package com.gaf.coursemanageapp.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class Trainee  extends BaseUserEntity{


    // mappedBy trỏ tới tên biến  ở trong .
    @ManyToMany(mappedBy = "trainees")
    // LAZY để tránh việc truy xuất dữ liệu không cần thiết. Lúc nào cần thì mới query
    @EqualsAndHashCode.Exclude

    private Collection<Class> classes;

//
//        // mappedBy trỏ tới tên biến  ở trong .
//    @ManyToMany(mappedBy = "trainees")
//    // LAZY để tránh việc truy xuất dữ liệu không cần thiết. Lúc nào cần thì mới query
//    @EqualsAndHashCode.Exclude
//
//    private Collection<Assignment> assignments;

}
