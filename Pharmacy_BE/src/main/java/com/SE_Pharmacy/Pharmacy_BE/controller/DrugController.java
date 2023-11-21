package com.SE_Pharmacy.Pharmacy_BE.controller;

import com.SE_Pharmacy.Pharmacy_BE.po.Cases;
import com.SE_Pharmacy.Pharmacy_BE.po.Drug;
import com.SE_Pharmacy.Pharmacy_BE.po.MedicineAmount;
import com.SE_Pharmacy.Pharmacy_BE.service.CasesService;
import com.SE_Pharmacy.Pharmacy_BE.service.DrugService;
import com.SE_Pharmacy.Pharmacy_BE.service.MedicineAmountService;
import com.SE_Pharmacy.Pharmacy_BE.vo.MedicineList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@RestController
@RequestMapping("/drugs")
public class DrugController {

    @Resource
    private DrugService drugService;

    @Resource
    private MedicineAmountService medicineAmountService;


    @Autowired
    public DrugController(DrugService drugService,MedicineAmountService medicineAmountService) {
        this.drugService = drugService;
        this.medicineAmountService=medicineAmountService;
    }



    @PostMapping("/drugs")
    public void addDrug(Drug drug) {
        drugService.addDrug(drug);
    }

    @DeleteMapping("/drugs/{id}")
    public void deleteDrug(@PathVariable int id) {
        drugService.deleteDrug(id);
    }

    @GetMapping("/drugs/all")
    public List<Drug> getAllDrugs() {
        return drugService.getAllDrugs();
    }

    @GetMapping("/drug/{id}")
    public Drug getDrugById(@PathVariable int id) {
        return drugService.getDrugById(id);
    }

    @PutMapping("/drugs")
    public void updateDrug(Drug drug) {
        drugService.updateDrug(drug);
    }

    @GetMapping("/drugs/medicineList/{c_id}")
    public List<MedicineList> getDrugs(@PathVariable int c_id){
        List<MedicineAmount> medicineAmountList = medicineAmountService.getMedicineAmountByCId(c_id);
        List<MedicineList> medicineList = new ArrayList<>();

        for (MedicineAmount medicineAmount : medicineAmountList) {
            int mid = medicineAmount.getMedicineId();
            int amount = medicineAmount.getAmount();
            String name = drugService.getDrugById(mid).getName();
            MedicineList medicine = new MedicineList(mid,name,amount);
            medicineList.add(medicine);
        }
        return medicineList;
    }
}