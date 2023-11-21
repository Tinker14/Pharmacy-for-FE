package com.SE_Pharmacy.Pharmacy_BE.controller;

import com.SE_Pharmacy.Pharmacy_BE.po.Doctor;
import com.SE_Pharmacy.Pharmacy_BE.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/DoctorController")
public class DoctorController {
    @Resource
    private DoctorService doctorService;

    // 添加医生
    @PostMapping("/doctor")
    public void addDoctor(Doctor doctor) {
        doctorService.insertDoctor(doctor);
    }

    // 更新医生信息
    @PutMapping("/doctor")
    public void updateDoctor(Doctor doctor) {
        doctorService.updateDoctor(doctor);
    }

    // 删除医生
    @DeleteMapping("/doctor")
    public void deleteDoctor(int id) {
        doctorService.deleteDoctor(id);
    }

    // 获取医生姓名
    @GetMapping("/doctor/{d_id}")
    public String getDoctorNameById(@PathVariable int d_id) {
        return doctorService.getNameById(d_id);
    }

    @GetMapping("/login/doctor/{d_id}")
    public Integer  getLoginUserUsingGet(@PathVariable int d_id){
        return doctorService.getLoginUserUsingGet(d_id);
    }
}
