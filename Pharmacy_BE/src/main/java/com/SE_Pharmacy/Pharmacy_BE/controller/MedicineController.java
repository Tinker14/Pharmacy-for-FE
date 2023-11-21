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

    @PostMapping("/medicines")
    public void addMedicine(Medicine medicine) {
        medicineService.addMedicine(medicine);
    }

    @DeleteMapping("/medicines/{name}")
    public ResponseEntity<Void> deleteMedicineByName(@PathVariable String name) {
        int id = drugService.getDrugByName(name).getId();
        Medicine medicine = medicineService.getMedicineById(id);
        medicineService.deleteMedicine(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

//    获得
//    @GetMapping("medicines/all")
//    public List<Medicine> getMedicines() {
//        return medicineService.getMedicines();
//    }

    @GetMapping("/medicines/{id}")
    public Medicine getMedicineById(@PathVariable int id) {
        return medicineService.getMedicineById(id);
    }

    @GetMapping("/medicines/{name}")
    public Medicine getMedicineByName(@PathVariable String name) {
        int id = drugService.getDrugByName(name).getId();
        return medicineService.getMedicineById(id);
    }

    @PutMapping("medicines")
    public ResponseEntity<Void> updateMedicineByname(@RequestBody String name) {
        int id = drugService.getDrugByName(name).getId();
        Medicine medicine = medicineService.getMedicineById(id);
        medicineService.updateMedicine(medicine);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    //获得库存信息stock
    @GetMapping("/medicines/stock")
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
