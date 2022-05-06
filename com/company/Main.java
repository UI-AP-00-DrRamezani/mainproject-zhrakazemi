package com.company;

import com.company.MainMenu.FirstPagePanel;
import com.company.entity.classes.Buyer;

public class Main {
    public static Buyer buyer;

    //this pointer will check if the user has logged in or not
    public static void main(String[] args) {
        FirstPagePanel firstPage = new FirstPagePanel();
        firstPage.firstPage();

    }
}
