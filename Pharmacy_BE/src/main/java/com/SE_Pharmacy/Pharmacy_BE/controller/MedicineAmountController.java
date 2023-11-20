package com.SE_Pharmacy.Pharmacy_BE.controller;

import com.SE_Pharmacy.Pharmacy_BE.po.MedicineAmount;
import com.SE_Pharmacy.Pharmacy_BE.service.MedicineAmountService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/MedicineAmountController")
public class MedicineAmountController {
    @Resource
    private MedicineAmountService medicineAmountService;

    @RequestMapping("/insertMedicineAmount")
    public void insertMedicineAmount(MedicineAmount medicineAmount){
        medicineAmountService.insertMedicineAmount(medicineAmount);
    }

    @RequestMapping("/updateMedicineAmount")
    public void updateMedicineAmount(MedicineAmount medicineAmount){
        medicineAmountService.updateMedicineAmount(medicineAmount);
    }

    @RequestMapping("/deleteMedicineAmount")
    public void deleteMedicineAmount(@Param("c_id") int cId, @Param("medicine_id") int medicineId){
        medicineAmountService.deleteMedicineAmount(cId,medicineId);
    }

    @RequestMapping("/getMedicineAmountByCId")
    public List<MedicineAmount> getMedicineAmountByCId(@Param("c_id") int cId){
        return medicineAmountService.getMedicineAmountByCId(cId);
    }
}
