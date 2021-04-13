package com.gaf.coursemanageapp.repository;

import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraineeRepository extends JpaRepository<Trainee,String> {

    Trainee findByUserName(String userName);
}
