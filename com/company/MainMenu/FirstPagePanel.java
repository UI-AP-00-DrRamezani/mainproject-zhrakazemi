package com.company.MainMenu;

import com.company.entity.classes.Admin;
import com.company.entity.classes.Goods;
import com.company.panelsandpages.panels.AdminPanel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstPagePanel {
    public static void firstPage() {
        while (true) {
            System.out.println("welcome! \nplease choose:\n1-viewing products\n2-log in \n3-log out");
            Scanner sc = new Scanner(System.in);
            int choose=0;
            try{
            choose = sc.nextInt();
            }catch (InputMismatchException mismatchException){
                System.out.println("The input type is incorrect");
            }
            if (choose == 1) {
                int i = 1;
                for (Goods a : Admin.realGoods) {
                    System.out.println(i + ".  " + a.getName() + "   " + a.getBrand() + "  " + a.getPrice());
                    i++;
                }
            } else if (choose == 2) {
                System.out.println("are you a : \n1-client \n2-seller");
                int role = sc.nextInt();
                if (role == 1) {
                    System.out.println("do you hava an account?\n1-Yes\n2-No");
                    int n = sc.nextInt();
                    if (n == 1) {
                        OnlineShopPanel.buyerlogin();
                    } else if (n == 2) {
                        OnlineShopPanel.clientSignUp();
                    }
                } else if (role == 2) {
                    OnlineShopPanel.sellerLogin();
                }
            } else if (choose == 3) {
                break;
            } else if (choose == 4) {
                System.out.println("secret word:");
                sc.nextLine();
                String secretWord = sc.nextLine();
                if (secretWord.equals("wind power")) {
                    AdminPanel.menu();
                }
            }
        }
    }
}
