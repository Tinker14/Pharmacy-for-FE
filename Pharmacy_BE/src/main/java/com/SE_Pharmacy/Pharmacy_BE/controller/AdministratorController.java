package com.SE_Pharmacy.Pharmacy_BE.controller;

import com.SE_Pharmacy.Pharmacy_BE.po.Administrator;
import com.SE_Pharmacy.Pharmacy_BE.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/AdministratorController")
public class AdministratorController {
    @Resource
    private AdministratorService administratorService;

    @RequestMapping("/getAdministrator")
    public Administrator getAdministratorById(int ano){
        return administratorService.getAdministratorById(ano);
    }

    @RequestMapping("/insertAdministrator")
    public void insertAdministrator(Administrator administrator){
        administratorService.insertAdministrator(administrator);
    }

    @RequestMapping("/updateAdministrator")
    public void updateAdministrator(Administrator administrator){
        administratorService.updateAdministrator(administrator);
    }

    @RequestMapping("/deleteAdministrator")
    public void deleteAdministrator(int ano){
        administratorService.deleteAdministrator(ano);
    }

    @RequestMapping("/getLoginUserUsingGet")
    public Integer  getLoginUserUsingGet(int ad_id){
        return administratorService.getLoginUserUsingGet(ad_id);
    }
}
