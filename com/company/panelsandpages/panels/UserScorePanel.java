package com.company.panelsandpages.panels;

import com.company.entity.classes.Goods;
import com.company.entity.classes.UserScores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserScorePanel {
    public static void getScore(Goods good) {
        UserScores clientsco = new UserScores();
        System.out.println("please enter your score to this product from 1 to 5 :");
        Scanner sc = new Scanner(System.in);
        try {
            double score = sc.nextDouble();
            good.clientsScore.add(score);
            clientsco.setScore(score);
            UserScoreCommander.countScore(good);
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
    }
}
