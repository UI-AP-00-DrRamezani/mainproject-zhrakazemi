package com.company.entity.classes;

import java.util.ArrayList;

public class Buyer extends GeneralAccount {
    public ArrayList<Goods> cart = new ArrayList<Goods>();
    public ArrayList<Goods> boughtGoods = new ArrayList<Goods>();
    private long money;

    public Buyer(String userName, String name, String lastName, String email, long phoneNumber, String password, long money) {
        super(userName, name, lastName, email, phoneNumber, password);
        setMoney(money);
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
}
