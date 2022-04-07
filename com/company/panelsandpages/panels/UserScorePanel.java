package com.company.panelsandpages.panels;

import com.company.entity.classes.Goods;
import com.company.entity.classes.UserScores;

import java.util.Scanner;

public class UserScorePanel {
    void getScore(Goods good) {
        UserScores clientsco = new UserScores();
        System.out.println("please enter your score to this product from 1 to 5 :");
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        good.clientsScore.add(score);
        clientsco.setScore(score );
        UserScoreCommander.countScore(good);
    }
}
