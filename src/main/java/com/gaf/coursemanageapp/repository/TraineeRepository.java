package com.gaf.coursemanageapp.repository;

import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee,String> {

    Trainee findByUserName(String userName);
}
