package com.SE_Pharmacy.Pharmacy_BE.vo;

public class CasesInformation {
    String p_name;

    String d_name;

    String gender;

    String advice;

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public CasesInformation(String ...a){
        this.p_name=a[0];
        this.d_name=a[1];
        this.gender=a[2];
        this.advice=a[3];
    }
}
