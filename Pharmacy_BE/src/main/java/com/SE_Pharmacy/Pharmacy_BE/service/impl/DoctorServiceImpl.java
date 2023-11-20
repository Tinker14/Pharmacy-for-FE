package com.SE_Pharmacy.Pharmacy_BE.service.impl;

import com.SE_Pharmacy.Pharmacy_BE.mapper.DoctorMapper;
import com.SE_Pharmacy.Pharmacy_BE.po.Doctor;
import com.SE_Pharmacy.Pharmacy_BE.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorMapper doctorMapper;


    @Override
    public void insertDoctor(Doctor doctor) {
        doctorMapper.insertDoctor(doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
       doctorMapper.updateDoctor(doctor);
    }

    @Override
    public void deleteDoctor(int id) {
        doctorMapper.deleteDoctor(id);
    }

    @Override
    public String getNameById(int id) {
        return doctorMapper.getNameById(id);
    }

    @Override
    public Integer getLoginUserUsingGet(int d_id) {
        return doctorMapper.getLoginUserUsingGet(d_id);
    }
}
