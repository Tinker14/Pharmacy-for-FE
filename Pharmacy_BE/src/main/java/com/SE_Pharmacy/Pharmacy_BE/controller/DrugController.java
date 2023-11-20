package com.SE_Pharmacy.Pharmacy_BE.controller;

import com.SE_Pharmacy.Pharmacy_BE.po.Drug;
import com.SE_Pharmacy.Pharmacy_BE.po.MedicineAmount;
import com.SE_Pharmacy.Pharmacy_BE.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/drugs")
public class DrugController {

    @Resource
    private DrugService drugService;

    @Resource
    private MedicineAmount medicineAmount;



    @Autowired
    public DrugController(DrugService drugService) {
        this.drugService = drugService;
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addDrug(@RequestBody Drug drug) {
        drugService.addDrug(drug);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDrug(@PathVariable int id) {
        drugService.deleteDrug(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Drug>> getAllDrugs() {
        List<Drug> drugs = drugService.getAllDrugs();
        return new ResponseEntity<>(drugs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Drug> getDrugById(@PathVariable int id) {
        Drug drug = drugService.getDrugById(id);
        return new ResponseEntity<>(drug, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Void> updateDrug(@RequestBody Drug drug) {
        drugService.updateDrug(drug);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}