package com.SE_Pharmacy.Pharmacy_BE.controller;

import com.SE_Pharmacy.Pharmacy_BE.po.Doctor;
import com.SE_Pharmacy.Pharmacy_BE.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/DoctorController")
public class DoctorController {
    @Resource
    private DoctorService doctorService;

    // 添加医生
    @RequestMapping("/insertDoctor")
    public void addDoctor(Doctor doctor) {
        doctorService.insertDoctor(doctor);
    }

    // 更新医生信息
    @RequestMapping("/updateDoctor")
    public void updateDoctor(Doctor doctor) {
        doctorService.updateDoctor(doctor);
    }

    // 删除医生
    @RequestMapping("/deleteDoctor")
    public void deleteDoctor(int id) {
        doctorService.deleteDoctor(id);
    }

    // 获取医生姓名
    @RequestMapping("/getDoctorName")
    public String getDoctorNameById(int id) {
        return doctorService.getNameById(id);
    }

    @RequestMapping("/getLoginUserUsingGet")
    public Integer  getLoginUserUsingGet(int d_id){
        return doctorService.getLoginUserUsingGet(d_id);
    }
}
