package com.company.entity.classes;



import java.util.ArrayList;
import java.util.Scanner;

public class UserReview {
     GeneralAccount user;
     String Text;
     String status;

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

    public void setStatus(String status) {
        this.status = status;
    }
}




