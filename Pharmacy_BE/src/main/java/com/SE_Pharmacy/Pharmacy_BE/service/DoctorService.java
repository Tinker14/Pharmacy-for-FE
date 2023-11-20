package com.SE_Pharmacy.Pharmacy_BE.service;

import com.SE_Pharmacy.Pharmacy_BE.po.Doctor;
import org.apache.ibatis.annotations.Param;

public interface DoctorService {
    void insertDoctor(Doctor doctor);

    void updateDoctor(Doctor doctor);

    void deleteDoctor(int id);

    String getNameById(int id);

    Integer getLoginUserUsingGet(int d_id);
}
