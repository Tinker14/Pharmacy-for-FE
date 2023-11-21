package com.SE_Pharmacy.Pharmacy_BE.vo;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DrugStock {
    String name;

    int id;

    int stock;

    Date d;

    SimpleDateFormat effective_date = new SimpleDateFormat("yyyy-MM-dd");


    public SimpleDateFormat getEffective_date() {
        return effective_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setEffective_date(SimpleDateFormat effective_date) {
        this.effective_date = effective_date;
    }


    public DrugStock(String name,int id,int stock,Date d) {
        this.name = name;
        this.id = id;
        this.stock = stock;
        this.d = d;
    }
}
