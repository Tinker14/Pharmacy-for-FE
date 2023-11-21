package com.SE_Pharmacy.Pharmacy_BE.controller;

import com.SE_Pharmacy.Pharmacy_BE.po.Medicine;
import com.SE_Pharmacy.Pharmacy_BE.service.DrugService;
import com.SE_Pharmacy.Pharmacy_BE.service.MedicineService;
import com.SE_Pharmacy.Pharmacy_BE.vo.DrugStock;
import com.fasterxml.jackson.databind.DatabindException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@RestController
@RequestMapping("/medicines")
public class MedicineController {

    @Resource
    private final MedicineService medicineService;

    @Resource
    private final DrugService drugService;

    List<DrugStock> DS = new ArrayList<>();

    @Autowired
    public MedicineController(MedicineService medicineService,DrugService drugService) {
        this.drugService = drugService;
        this.medicineService = medicineService;
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addMedicine(@RequestBody Medicine medicine) {
        medicineService.addMedicine(medicine);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{name}")
    public ResponseEntity<Void> deleteMedicineByname(@PathVariable String name) {
        int id = drugService.getDrugByName(name).getId();
        Medicine medicine = medicineService.getMedicineById(id);
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

    @GetMapping("/{name}")
    public ResponseEntity<Medicine> getMedicineByName(@PathVariable String name) {
        int id = drugService.getDrugByName(name).getId();
        Medicine medicine = medicineService.getMedicineById(id);
        return new ResponseEntity<>(medicine, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Void> updateMedicineByname(@RequestBody String name) {
        int id = drugService.getDrugByName(name).getId();
        Medicine medicine = medicineService.getMedicineById(id);
        medicineService.updateMedicine(medicine);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/get stock")
    public List<DrugStock>getStock(){

        List<Medicine> medicines = medicineService.getMedicines();
        for(Medicine m : medicines){
            int id = m.getId();
            int stock = m.getStock();
            Date d = m.getEffectiveDate();
            String name = drugService.getDrugById(id).getName();
            DrugStock ds = new DrugStock(name,id,stock,  d);
            DS.add(ds);
        }
        return DS;
    }


}
