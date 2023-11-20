package com.SE_Pharmacy.Pharmacy_BE.service;
import com.SE_Pharmacy.Pharmacy_BE.po.Administrator;
import org.apache.ibatis.annotations.Param;


public interface AdministratorService {
    Administrator getAdministratorById(int ano);
    void insertAdministrator(Administrator administrator);

    void updateAdministrator(Administrator administrator);

    void deleteAdministrator(int ano);

    Integer getLoginUserUsingGet(int ad_id);
}
