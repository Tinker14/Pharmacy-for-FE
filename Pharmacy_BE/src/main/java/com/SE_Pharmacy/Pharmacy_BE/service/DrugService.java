package com.SE_Pharmacy.Pharmacy_BE.service;

import com.SE_Pharmacy.Pharmacy_BE.po.Drug;

import java.util.List;

public interface DrugService {

    void addDrug(Drug drug);

    void deleteDrug(int id);

    List<Drug> getAllDrugs();

    Drug getDrugById(int id);

    void updateDrug(Drug drug);

    Drug getDrugByName(String name);
}
