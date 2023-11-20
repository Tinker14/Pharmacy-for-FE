package com.SE_Pharmacy.Pharmacy_BE.vo;

public class MedicineList {
    int id;
    String name;

    int amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public MedicineList(int id,String name,int amount){
        this.id= id;
        this.name=name;
        this.amount=amount;
    }
}
