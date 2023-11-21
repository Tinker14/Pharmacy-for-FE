package com.SE_Pharmacy.Pharmacy_BE.controller;

import com.SE_Pharmacy.Pharmacy_BE.po.MedicineAmount;
import com.SE_Pharmacy.Pharmacy_BE.service.MedicineAmountService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/MedicineAmountController")
public class MedicineAmountController {
    @Resource
    private MedicineAmountService medicineAmountService;

    @PostMapping("/medicineAmounts")
    public void insertMedicineAmount(MedicineAmount medicineAmount){
        medicineAmountService.insertMedicineAmount(medicineAmount);
    }

    @PutMapping("/medicineAmounts")
    public void updateMedicineAmount(MedicineAmount medicineAmount){
        medicineAmountService.updateMedicineAmount(medicineAmount);
    }

    @DeleteMapping("/medicineAmounts/{c_id}/{medicine_id}")
    public void deleteMedicineAmount(@PathVariable int c_id, @PathVariable int medicine_id){
        medicineAmountService.deleteMedicineAmount(c_id,medicine_id);
    }

    @GetMapping("/medicineAmounts/{c_id}")
    public List<MedicineAmount> getMedicineAmountByCId(@PathVariable int c_id){
        return medicineAmountService.getMedicineAmountByCId(c_id);
    }
}
