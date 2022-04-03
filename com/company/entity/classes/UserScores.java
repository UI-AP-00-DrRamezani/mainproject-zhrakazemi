package com.company.entity.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class UserScores {
    private GeneralAccount user;
    private double score;
    private Goods good;
    ArrayList<UserScores> clientsScore = new ArrayList<UserScores>();

    void getScore (){
        UserScores clientsco = new UserScores();
        //setUser(//TODO login);
        System.out.println("please enter your score to this product from 1 to 5 :");
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        setScore(score);
        //setGood();
    }

    public GeneralAccount getUser() {
        return user;
    }

    public void setUser(GeneralAccount user) {
        this.user = user;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Goods getGood() {
        return good;
    }

    public void setGood(Goods good) {
        this.good = good;
    }
}
