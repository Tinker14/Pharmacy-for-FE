package com.SE_Pharmacy.Pharmacy_BE.mapper;

import com.SE_Pharmacy.Pharmacy_BE.po.MedicineAmount;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MedicineAmountMapper {
    @Insert("INSERT INTO medicineamount (c_id,medicine_id,amount) " +
            "VALUES (#{c_id}, #{medicine_id}, #{amount}})")
    void insertMedicineAmount(MedicineAmount medicineAmount);

    @Update("UPDATE medicineamount SET c_id = #{c_id}, medicine_id = #{medicine_id},amount = #{amount}")
    void updateMedicineAmount(MedicineAmount medicineAmount);

    @Delete("DELETE FROM medicineamount WHERE c_id = #{c_id}")
    void deleteMedicineAmount(@Param("c_id") int cId,@Param("medicine_id") int medicineId);

    @Select("SELECT * FROM medicineamount WHERE c_id = #{c_id}")
    List<MedicineAmount> getMedicineAmountByCId(@Param("c_id") int cId);
}
