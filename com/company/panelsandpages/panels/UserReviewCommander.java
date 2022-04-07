package com.company.panelsandpages.panels;

import com.company.entity.classes.Goods;
import com.company.entity.classes.UserReview;

public class UserReviewCommander {
    public static void addReview(UserReview review){
        if(review.getStatus()=="accepted") {
            Goods.clientsView.add(review);
        }
    }
}
