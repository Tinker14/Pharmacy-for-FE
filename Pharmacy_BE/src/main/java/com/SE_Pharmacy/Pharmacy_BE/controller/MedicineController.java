package com.SE_Pharmacy.Pharmacy_BE.controller;

import com.SE_Pharmacy.Pharmacy_BE.po.Medicine;
import com.SE_Pharmacy.Pharmacy_BE.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/medicines")
public class MedicineController {

    @Resource
    private final MedicineService medicineService;

    @Autowired
    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addMedicine(@RequestBody Medicine medicine) {
        medicineService.addMedicine(medicine);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMedicine(@PathVariable int id) {
        medicineService.deleteMedicine(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping()
    public ResponseEntity<List<Medicine>> getMedicines() {
        List<Medicine> medicines = medicineService.getMedicines();
        return new ResponseEntity<>(medicines, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicine> getMedicineById(@PathVariable int id) {
        Medicine medicine = medicineService.getMedicineById(id);
        return new ResponseEntity<>(medicine, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Void> updateMedicine(@RequestBody Medicine medicine) {
        medicineService.updateMedicine(medicine);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
