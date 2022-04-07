package com.company.panelsandpages.panels;

import com.company.entity.classes.Admin;
import com.company.entity.classes.Buyer;
import com.company.entity.classes.Goods;
import com.company.entity.classes.UserReview;

import java.util.Scanner;

public class UserReviewpanel {
    UserReviewpanel getInof(Buyer buyer, Goods good) {
        UserReview client = new UserReview();
        boolean bought = false;
        for (Goods a : buyer.boughtGoods) {
            if (a == good) {
                System.out.println("please enter yor review here ");
                Scanner sc = new Scanner(System.in);
                String veiw = sc.nextLine();
                client.setText(veiw);
                client.setStatus("waiting");
                bought = true;
            }
        }
        if (bought == true) {
            return this;
        } else {
            return null;
        }
    }
}
