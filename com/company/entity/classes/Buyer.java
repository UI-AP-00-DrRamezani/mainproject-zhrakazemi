package com.company.entity.classes;

import java.util.ArrayList;

public class Buyer extends GeneralAccount{
    ArrayList<Goods> cart = new ArrayList<Goods>();
    //ArrayList<Goods> cart = new ArrayList<Goods>();

    public Buyer(String userName, String name, String lastName, String email, long phoneNumber, String password, long money, long budget) {
        super(userName, name, lastName, email, phoneNumber, password);
        this.budget = budget;
    }

    //TODO سابقه خرید
    long budget;
    void shopping (){
        int number = cart.size();
        for(int i=0 ; i<number ; i++){
            if (budget > cart.get(i).getPrice()){
                budget-=cart.get(i).getPrice();
                //TODO اضافه شدن به فاکتور
                //TODO اضافه شدن به سابقه خرید
            }
        }

    }
}
