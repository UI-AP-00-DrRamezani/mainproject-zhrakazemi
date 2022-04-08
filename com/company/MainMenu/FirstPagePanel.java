package com.company.MainMenu;

import com.company.panelsandpages.panels.CategoryPanel;

import java.util.Scanner;

public class FirstPagePanel {
    public void firstPage(){
        System.out.println("welcome! \nplease choose:\n1-viewing products\n2-log in ");
        Scanner sc  =new Scanner(System.in);
        int choose = sc.nextInt();
        if(choose==1){
            CategoryPanel.showProduct();
        }
        else if(choose==2){
            OnlineShopPanel.login();
        }
    }
}
