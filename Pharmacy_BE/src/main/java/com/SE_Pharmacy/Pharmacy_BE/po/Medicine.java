package com.SE_Pharmacy.Pharmacy_BE.po;

import java.util.Date;
public class Medicine {


    private int id;

    private Date effectiveDate;

    private int stock;

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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

