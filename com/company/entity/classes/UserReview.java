package com.company.entity.classes;


import com.company.panelsandpages.panels.UserReviewpanel;

public class UserReview extends UserReviewpanel {
    GeneralAccount user;
    private String Text;
    public static String status;

    public GeneralAccount getUser() {
        return user;
    }

    public void setUser(GeneralAccount user) {
        this.user = user;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        UserReview.status = status;
    }
}




