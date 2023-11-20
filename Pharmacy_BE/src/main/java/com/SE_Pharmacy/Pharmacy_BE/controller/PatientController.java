package com.SE_Pharmacy.Pharmacy_BE.controller;

import com.SE_Pharmacy.Pharmacy_BE.po.Patient;
import com.SE_Pharmacy.Pharmacy_BE.service.PatientService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/PatientController")
public class PatientController {
    @Resource
    private PatientService patientService;

    //添加一个病人
    @RequestMapping("/insertPatience")
    public void insertPatience(Patient patient){
        patientService.insertPatience(patient);
    }

    //更新病人信息
    @RequestMapping("/updatePatient")
    public void updatePatient(Patient patient){
        patientService.updatePatient(patient);
    }

    //删除一个病人
    @RequestMapping("/deletePatient")
    public void deletePatient(@Param("p_id") int id){
        patientService.deletePatient(id);
    }

    //获取病人姓名
    @RequestMapping("/getNameById")
    public String getNameById(@Param("p_id") int id){
        return patientService.getNameById(id);
    }

    @RequestMapping("/getLoginUserUsingGet")
    public Integer  getLoginUserUsingGet(int p_id){
        return patientService.getLoginUserUsingGet(p_id);
    }
}
