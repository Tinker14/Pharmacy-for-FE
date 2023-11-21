package com.SE_Pharmacy.Pharmacy_BE.service;
import com.SE_Pharmacy.Pharmacy_BE.po.Administrator;
import org.apache.ibatis.annotations.Param;


public interface AdministratorService {
    Administrator getAdministratorById(int ad_id);
    void insertAdministrator(Administrator administrator);

    void updateAdministrator(Administrator administrator);

    void deleteAdministrator(int ad_id);

    Integer getLoginUserUsingGet(int ad_id);
}
