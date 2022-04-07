package com.company.panelsandpages.panels;

import com.company.entity.classes.Buyer;
import com.company.entity.classes.Goods;
import com.company.entity.classes.UserScores;

import java.util.ArrayList;
import java.util.Scanner;

public class UserScoreCommander {


  public static   void countScore(Goods goods) {
        double sum = 0;
        int counter = 0;
        for (Double a : goods.clientsScore ) {
            sum += a;
            counter++;
        }
        double averageScore = sum / counter;
        goods.setAverageScore(averageScore);
    }
}

