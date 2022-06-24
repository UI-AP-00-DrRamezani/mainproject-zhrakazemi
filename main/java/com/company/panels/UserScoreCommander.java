package com.company.panels;

import com.company.entity.classes.Goods;

public class UserScoreCommander {
    public static void countScore(Goods goods) {
        double sum = 0;
        int counter = 0;
        for (Double a : goods.clientsScore) {
            sum += a;
            counter++;
        }
        double averageScore = sum / counter;
        goods.setAverageScore(averageScore);
    }
}

