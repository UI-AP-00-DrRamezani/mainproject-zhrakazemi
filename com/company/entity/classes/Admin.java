package com.company.entity.classes;

import java.util.ArrayList;

public class Admin extends GeneralAccount {
    public static Admin newAdmin = new Admin("Addmin", "zahra", "kazemi", "zahrak19902@gmai.com",
            911111111, "12345");
    public static ArrayList<SalePerson> reallSellers = new ArrayList<SalePerson>();
    public static ArrayList<Goods> notConfirmedGoods = new ArrayList<>();
    public static ArrayList<Goods> chngedProducts = new ArrayList<>();
    public static ArrayList<Goods> realGoods = new ArrayList<>();

    private Admin(String userName, String name, String lastName, String email, long phoneNumber, String password) {
        super(userName, name, lastName, email, phoneNumber, password);
    }
}
