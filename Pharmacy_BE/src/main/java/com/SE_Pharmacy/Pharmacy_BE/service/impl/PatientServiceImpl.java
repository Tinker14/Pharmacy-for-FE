package com.SE_Pharmacy.Pharmacy_BE.service.impl;

import com.SE_Pharmacy.Pharmacy_BE.mapper.PatientMapper;
import com.SE_Pharmacy.Pharmacy_BE.po.Patient;
import com.SE_Pharmacy.Pharmacy_BE.service.PatientService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientMapper patientMapper;

    @Override
    public void insertPatience(Patient patient) {
        patientMapper.insertPatience(patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        patientMapper.updatePatient(patient);
    }

    @Override
    public void deletePatient(int id) {
        patientMapper.deletePatient(id);
    }

    @Override
    public String getNameById(int id) {
        return patientMapper.getNameById(id);
    }

    @Override
    public String getGenderById(@Param("p_id") int p_id){
        return patientMapper.getGenderById(p_id);
    }

    @Override
    public Integer getLoginUserUsingGet(int p_id) {
        return patientMapper.getLoginUserUsingGet(p_id);
    }

}
