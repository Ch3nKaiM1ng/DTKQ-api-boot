package com.dtkq.api.dao;


import com.dtkq.api.entity.Doctor;

import java.util.List;

public interface DoctorMapper {

    List<Doctor> selectAll();

    List<Doctor> select(Doctor doctor);


    int deleteByPrimaryKey(Doctor doctor);

    int insert(Doctor doctor);

    Doctor selectByPrimaryKey(Doctor doctor);

    int updateByPrimaryKey(Doctor doctor);

}