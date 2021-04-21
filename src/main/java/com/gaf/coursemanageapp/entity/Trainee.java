package com.gaf.coursemanageapp.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Trainee  extends BaseUserEntity{


    // mappedBy trỏ tới tên biến  ở trong .
    @ManyToMany(mappedBy = "trainees")
    // LAZY để tránh việc truy xuất dữ liệu không cần thiết. Lúc nào cần thì mới query
    @EqualsAndHashCode.Exclude

    private Collection<Class> classes;


//        // mappedBy trỏ tới tên biến  ở trong .
//    @ManyToMany(mappedBy = "trainees",targetEntity = Assignment.class)
//    // LAZY để tránh việc truy xuất dữ liệu không cần thiết. Lúc nào cần thì mới query
//    @EqualsAndHashCode.Exclude// không sử dụng trường này trong equals và hashcode
//    @ToString.Exclude
//    private Collection<Assignment> assignments;

}
