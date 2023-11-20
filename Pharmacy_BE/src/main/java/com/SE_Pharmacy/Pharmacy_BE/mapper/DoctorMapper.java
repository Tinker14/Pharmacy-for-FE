package com.SE_Pharmacy.Pharmacy_BE.mapper;
import com.SE_Pharmacy.Pharmacy_BE.po.Doctor;
import org.apache.ibatis.annotations.*;


@Mapper
public interface DoctorMapper {
    @Insert("INSERT INTO doctor (d_id,name,pw) " +
            "VALUES (#{d_id}, #{name}, #{pw})")
    void insertDoctor(Doctor doctor);

    @Update("UPDATE doctor SET d_id = #{d_id}, name = #{name}, pw = #{pw}")
    void updateDoctor(Doctor doctor);

    @Delete("DELETE FROM doctor WHERE d_id = #{d_id}")
    void deleteDoctor(@Param("d_id") int id);


    //获取医生名字
    @Select("SELECT * FROM doctor WHERE d_id = #{d_id}")
    String getNameById(@Param("d_id") int id);

    @Select("SELECT role FROM doctor WHERE d_id =#{d_id}")
    Integer getLoginUserUsingGet(@Param("d_id") int d_id);
}
