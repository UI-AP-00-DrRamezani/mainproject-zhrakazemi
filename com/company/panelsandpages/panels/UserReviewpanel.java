package com.company.panelsandpages.panels;

import com.company.entity.classes.Buyer;
import com.company.entity.classes.UserReview;

import java.util.Scanner;

public class UserReviewpanel {
    UserReviewpanel getInof(Buyer buyer) {
        UserReview client = new UserReview();
        System.out.println("please enter yor review here ");
        Scanner sc = new Scanner(System.in);
        String veiw = sc.nextLine();
        client.setText(veiw);
        client.setStatus("waiting");
        return this;
    }

}
