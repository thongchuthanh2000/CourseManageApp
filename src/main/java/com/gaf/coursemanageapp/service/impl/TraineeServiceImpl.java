package com.gaf.coursemanageapp.service.impl;

import com.gaf.coursemanageapp.entity.Trainee;
import com.gaf.coursemanageapp.repository.AdminRepository;
import com.gaf.coursemanageapp.repository.TraineeRepository;
import com.gaf.coursemanageapp.service.ITraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraineeServiceImpl implements ITraineeService {

    @Autowired
    private TraineeRepository traineeRepository;

    @Override
    public List<Trainee> findAll() {
        return null;
    }

    @Override
    public void save(Trainee trainee) {

    }

    @Override
    public Trainee findByUserName(String userName) {
        return null;
    }
}
