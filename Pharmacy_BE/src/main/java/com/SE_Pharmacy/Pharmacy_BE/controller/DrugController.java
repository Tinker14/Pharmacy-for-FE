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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@RestController
@RequestMapping("/drugs")
public class DrugController {

    @Resource
    private DrugService drugService;

    @Resource
    private MedicineAmountService medicineAmountService;



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

    @GetMapping("/getdrugs")
    public List<MedicineList>getdrugs(int c_id){
        List<MedicineAmount> medicineAmountList = medicineAmountService.getMedicineAmountByCId(c_id);
        List<MedicineList> medicineList = new List<MedicineList>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<MedicineList> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(MedicineList medicineList) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends MedicineList> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends MedicineList> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public MedicineList get(int index) {
                return null;
            }

            @Override
            public MedicineList set(int index, MedicineList element) {
                return null;
            }

            @Override
            public void add(int index, MedicineList element) {

            }

            @Override
            public MedicineList remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<MedicineList> listIterator() {
                return null;
            }

            @Override
            public ListIterator<MedicineList> listIterator(int index) {
                return null;
            }

            @Override
            public List<MedicineList> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

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