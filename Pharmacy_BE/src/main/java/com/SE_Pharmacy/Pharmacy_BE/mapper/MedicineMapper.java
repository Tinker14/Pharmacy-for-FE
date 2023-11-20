package com.SE_Pharmacy.Pharmacy_BE.mapper;

import com.SE_Pharmacy.Pharmacy_BE.po.Medicine;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MedicineMapper {

    @Insert("INSERT INTO medicine (id, effective_date, storehouse_id, stock) " +
            "VALUES (#{id}, #{effectiveDate}, #{storehouseId}, #{stock})")
    void addMedicine(Medicine medicine);

    @Delete("DELETE FROM medicine WHERE id = #{id}")
    void deleteMedicine(int id);

    @Select("SELECT * FROM medicine WHERE storehouse_id = #{storehouseId}")
    List<Medicine> getMedicines();

    @Select("SELECT * FROM medicine WHERE id = #{id}")
    Medicine getMedicineById(int id);

    @Update("UPDATE medicine SET effective_date = #{effectiveDate}, storehouse_id = #{storehouseId}, " +
            "stock = #{stock} WHERE id = #{id}")
    void updateMedicine(Medicine medicine);
}
