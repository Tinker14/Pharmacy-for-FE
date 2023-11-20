package com.SE_Pharmacy.Pharmacy_BE.service.impl;

import com.SE_Pharmacy.Pharmacy_BE.mapper.MedicineMapper;
import com.SE_Pharmacy.Pharmacy_BE.po.Medicine;
import com.SE_Pharmacy.Pharmacy_BE.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {

    private final MedicineMapper medicineMapper;

    @Autowired
    public MedicineServiceImpl(MedicineMapper medicineMapper) {
        this.medicineMapper = medicineMapper;
    }

    @Override
    public void addMedicine(Medicine medicine) {
        medicineMapper.addMedicine(medicine);
    }

    @Override
    public void deleteMedicine(int id) {
        medicineMapper.deleteMedicine(id);
    }

    @Override
    public List<Medicine> getMedicines() {
        return medicineMapper.getMedicines();
    }

    @Override
    public Medicine getMedicineById(int id) {
        return medicineMapper.getMedicineById(id);
    }

    @Override
    public void updateMedicine(Medicine medicine) {
        medicineMapper.updateMedicine(medicine);
    }
}
