package com.SE_Pharmacy.Pharmacy_BE.service.impl;

import com.SE_Pharmacy.Pharmacy_BE.mapper.AdministratorMapper;
import com.SE_Pharmacy.Pharmacy_BE.po.Administrator;
import com.SE_Pharmacy.Pharmacy_BE.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorServiceImpl implements AdministratorService {
    @Autowired
    private AdministratorMapper administratorMapper;

    @Override
    public Administrator getAdministratorById(int ano){
        return administratorMapper.getAdministratorById(ano);
    }

    @Override
    public void insertAdministrator(Administrator administrator){
        administratorMapper.insertAdministrator(administrator);
    }

    @Override
    public void updateAdministrator(Administrator administrator) {
        administratorMapper.updateAdministrator(administrator);
    }

    @Override
    public void deleteAdministrator(int ano) {
        administratorMapper.deleteAdministrator(ano);
    }

    @Override
    public Integer getLoginUserUsingGet(int ad_id) {
        return administratorMapper.getLoginUserUsingGet(ad_id);
    }
}
