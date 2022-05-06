package com.company.entity.classes;

import java.util.ArrayList;

public class SalePerson extends GeneralAccount {
    private String companyName;
    private String companyNo;
    public static ArrayList<Goods> goods = new ArrayList<Goods>();
    public ArrayList<Goods> saledGoods = new ArrayList<Goods>();
    public ArrayList<Goods> deleteRequests = new ArrayList<Goods>();

    public SalePerson(String userName, String name, String lastName, String email, long phoneNumber, String password, String companyName, String companyNo) {
        super(userName, name, lastName, email, phoneNumber, password);
        this.companyName = companyName;
        this.companyNo = companyNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }
}
