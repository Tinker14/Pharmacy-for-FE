package com.SE_Pharmacy.Pharmacy_BE.controller;

import com.SE_Pharmacy.Pharmacy_BE.po.Patient;
import com.SE_Pharmacy.Pharmacy_BE.service.PatientService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/PatientController")
public class PatientController {
    @Resource
    private PatientService patientService;

    //添加一个病人
    @PostMapping("/patients")
    public void insertPatience(Patient patient){
        patientService.insertPatience(patient);
    }

    //更新病人信息
    @PutMapping("/patients")
    public void updatePatient(Patient patient){
        patientService.updatePatient(patient);
    }

    //删除一个病人
    @DeleteMapping("/patients/{p_id}")
    public void deletePatient(@PathVariable int p_id){
        patientService.deletePatient(p_id);
    }

    //获取病人姓名
    @GetMapping("/patients/{p_id}")
    public String getNameById(@PathVariable int p_id){
        return patientService.getNameById(p_id);
    }

    @GetMapping("/login/patient/{p_id}")
    public Integer  getLoginUserUsingGet(@PathVariable int p_id){
        return patientService.getLoginUserUsingGet(p_id);
    }
}
