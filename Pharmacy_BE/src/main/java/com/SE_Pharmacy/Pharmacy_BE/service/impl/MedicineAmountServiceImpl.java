package com.SE_Pharmacy.Pharmacy_BE.service.impl;

import com.SE_Pharmacy.Pharmacy_BE.mapper.MedicineAmountMapper;
import com.SE_Pharmacy.Pharmacy_BE.po.MedicineAmount;
import com.SE_Pharmacy.Pharmacy_BE.service.MedicineAmountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineAmountServiceImpl implements MedicineAmountService {
    private MedicineAmountMapper medicineAmountMapper;

    @Override
    public void insertMedicineAmount(MedicineAmount medicineAmount) {
        medicineAmountMapper.insertMedicineAmount(medicineAmount);
    }

    @Override
    public void updateMedicineAmount(MedicineAmount medicineAmount) {
        medicineAmountMapper.updateMedicineAmount(medicineAmount);
    }

    @Override
    public void deleteMedicineAmount(int cId, int medicineId) {
        medicineAmountMapper.deleteMedicineAmount(cId,medicineId);
    }

    @Override
    public List<MedicineAmount> getMedicineAmountByCId(int cId) {
        return medicineAmountMapper.getMedicineAmountByCId(cId);
    }
}
