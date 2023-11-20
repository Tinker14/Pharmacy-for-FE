package com.SE_Pharmacy.Pharmacy_BE.service.impl;

import com.SE_Pharmacy.Pharmacy_BE.mapper.CasesMapper;
import com.SE_Pharmacy.Pharmacy_BE.po.Cases;
import com.SE_Pharmacy.Pharmacy_BE.service.CasesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasesServiceImpl implements CasesService {
    private CasesMapper casesMapper;

    @Override
    public void insertCases(Cases cases) {
        casesMapper.insertCases(cases);
    }

    @Override
    public void deleteCases(Cases cases) {
        casesMapper.deleteCases(cases);
    }

    @Override
    public void updateCases(Cases cases) {
        casesMapper.updateCases(cases);
    }

    @Override
    public void deleteMedicines(int c_id) {
        casesMapper.deleteMedicines(c_id);
    }

    @Override
    public List<Cases> getMedicine(int c_id) {
        return casesMapper.getMedicine(c_id);
    }

    //获取医生id
    @Override
    public Integer getDidByCid(int c_id){
        return casesMapper.getDidByCid(c_id);
    }

    //获取病人id
    @Override
    public Integer getPidByCid(int c_id) {
        return casesMapper.getPidByCid(c_id);
    }
    @Override
    public String getAdvByCid(int c_id){
        return casesMapper.getAdvByCid(c_id);
    }
}
