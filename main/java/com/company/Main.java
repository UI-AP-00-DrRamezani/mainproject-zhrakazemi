package com.company;

import com.company.MainMenu.FirstPagePanel;
import com.company.entity.classes.Buyer;
import com.company.entity.classes.Folders;
import com.company.entity.classes.readData;

public class Main {
    public static Buyer buyer;

    //this pointer will check if the user has logged in or not
    public static void main(String[] args) {
        Folders.creatFolders();
        readData.readData();
        FirstPagePanel firstPage = new FirstPagePanel();
        firstPage.firstPage();

    }
}
