package com.gaf.coursemanageapp.service;


import com.gaf.coursemanageapp.entity.Trainee;

import java.util.List;

public interface ITraineeService {
    public List<Trainee> findAll();
    public void save(Trainee trainee);
    public  Trainee findByUserName(String userName);
}
