package com.SE_Pharmacy.Pharmacy_BE.po;

import io.swagger.models.auth.In;

import java.util.Date;
public class Medicine {


    private int id;

    private Date effectiveDate;

    private Integer stock;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }



}

