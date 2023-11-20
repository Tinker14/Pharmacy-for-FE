package com.SE_Pharmacy.Pharmacy_BE.service;

import com.SE_Pharmacy.Pharmacy_BE.po.Cases;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CasesService {
    void insertCases(Cases cases);

    void deleteCases(Cases cases);

    void updateCases(Cases cases);

    void deleteMedicines(@Param("c_id") int c_id);

    List<Cases> getMedicine(@Param("c_id") int c_id);

    //获取医生id
    Integer getDidByCid(@Param("c_id") int c_id);

    //获取病人id
    Integer getPidByCid(@Param("c_id") int c_id);

    String getAdvByCid(@Param("c_id") int c_Id);
}
