package com.SE_Pharmacy.Pharmacy_BE.controller;

import com.SE_Pharmacy.Pharmacy_BE.po.Cases;
import com.SE_Pharmacy.Pharmacy_BE.service.CasesService;
import com.SE_Pharmacy.Pharmacy_BE.service.DoctorService;
import com.SE_Pharmacy.Pharmacy_BE.service.PatientService;
import com.SE_Pharmacy.Pharmacy_BE.vo.CasesInformation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/CasesController")
public class CasesController {
    @Resource
    private CasesService casesService;

    @Resource
    private DoctorService doctorService;

    @Resource
    private PatientService patientService;

    @RequestMapping("/insertCases")
    public void insertCases(Cases cases){
        casesService.insertCases(cases);
    }

    @RequestMapping("/deleteCases")
    public void deleteCases(Cases cases){
        casesService.deleteCases(cases);
    }

    @RequestMapping("/updateCases")
    public void updateCases(Cases cases){
        casesService.updateCases(cases);
    }

    @RequestMapping("/deCases")
    public void deleteMedicines(@Param("c_id") int c_id){
        casesService.deleteMedicines(c_id);
    }

    @RequestMapping("/getMedicine")
    public List<Cases> getMedicine(@Param("c_id") int c_id){
        return casesService.getMedicine(c_id);
    }

    @RequestMapping("/getCase")
    public CasesInformation getCase(@Param("c_id") int c_id){
        int p_id = casesService.getPidByCid(c_id);
        int d_id = casesService.getDidByCid(c_id);
        String p_name = patientService.getNameById(p_id);
        String d_name = doctorService.getNameById(d_id);
        String gender = patientService.getGenderById(p_id);
        String advice = casesService.getAdvByCid(c_id);

        return new CasesInformation(p_name,d_name,gender,advice);
    }
}
