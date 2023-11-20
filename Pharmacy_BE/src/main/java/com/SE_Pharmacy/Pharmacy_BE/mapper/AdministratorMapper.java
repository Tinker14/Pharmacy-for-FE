package com.SE_Pharmacy.Pharmacy_BE.mapper;

import com.SE_Pharmacy.Pharmacy_BE.po.Administrator;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.*;
@Mapper
public interface AdministratorMapper {

    @Select("SELECT * FROM administrator WHERE ad_id = #{ad_id}")
    Administrator getAdministratorById(@Param("ad_id") int ad_id);

    @Insert("INSERT INTO administrator (ad_id,name,pw) " +
            "VALUES (#{ad_id}, #{name}, #{pw})")
    void insertAdministrator(Administrator administrator);

    @Update("UPDATE administrator SET ad_id = #{ad_id}, name = #{name}, pw = #{pw}")
    void updateAdministrator(Administrator administrator);

    @Delete("DELETE FROM administrator WHERE ad_id = #{ad_id}")
    void deleteAdministrator(@Param("ad_id") int ad_id);

    @Select("SELECT role FROM administrator WHERE ad_id =#{ad_id}")
    Integer getLoginUserUsingGet(@Param("ad_id") int ad_id);
}
