package com.SE_Pharmacy.Pharmacy_BE.controller;

import com.SE_Pharmacy.Pharmacy_BE.po.Administrator;
import com.SE_Pharmacy.Pharmacy_BE.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/AdministratorController")
public class AdministratorController {
    @Resource
    private AdministratorService administratorService;

    @GetMapping("/administrator/{id}")
    public Administrator getAdministratorById(@PathVariable int id){
        return administratorService.getAdministratorById(id);
    }

    @PostMapping("/administrator")
    public void insertAdministrator(Administrator administrator){
        administratorService.insertAdministrator(administrator);
    }

    @PutMapping("/administrator")
    public void updateAdministrator(Administrator administrator){
        administratorService.updateAdministrator(administrator);
    }

    @DeleteMapping("/administrator/{ad_id}")
    public void deleteAdministrator(@PathVariable int ad_id){
        administratorService.deleteAdministrator(ad_id);
    }

    @GetMapping("/login/administrator/{ad_id}")
    public Integer  getLoginUserUsingGet(@PathVariable int ad_id){
        return administratorService.getLoginUserUsingGet(ad_id);
    }
}
