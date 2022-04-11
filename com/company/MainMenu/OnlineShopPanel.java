package com.company.MainMenu;

import com.company.Main;
import com.company.entity.classes.Admin;
import com.company.entity.classes.Buyer;
import com.company.entity.classes.Goods;
import com.company.entity.classes.SalePerson;
import com.company.panelsandpages.panels.BuyerPanel;
import com.company.panelsandpages.panels.SellerPanel;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShopPanel {
    public static ArrayList<Buyer> buyers = new ArrayList<Buyer>();
    public static ArrayList<SalePerson> sellers = new ArrayList<SalePerson>();
    public static ArrayList<Goods> goods = new ArrayList<Goods>();

    public static void clientSignUp() {
        System.out.println("please enter your information: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("please choose an ID: ");
        String userName = sc.nextLine();
        for (Buyer a : buyers) {
            while (userName.equals(a.getUserName())) {
                System.out.println("already taken , please choose another username");
                userName = sc.nextLine();
            }
        }
        System.out.println("done! now please enter your name: ");
        String name = sc.nextLine();
        System.out.println("enter your lastName: ");
        String lastName = sc.nextLine();
        System.out.println("enter your E_mail adress: ");
        String email = sc.nextLine();
        System.out.println("enter your phone number: ");
        long phonenumber = sc.nextLong();
        System.out.println("please enter how much money you want to put in your account: ");
        long money = sc.nextLong();
        System.out.println("well done! \n now please choose an strong password: ");
        sc.nextLine();
        String password = sc.nextLine();
        System.out.println("please reenter your password: ");
        String pass2 = sc.nextLine();
        while (!pass2.equals(password)) {
            System.out.println("passwords dosent match , try again");
            pass2 = sc.nextLine();
        }
        System.out.println("done! for entering System press one: ");
        int one = sc.nextInt();
        Buyer buyer = new Buyer(userName, name, lastName, email, phonenumber, password, money);
        buyers.add(buyer);
        if (one == 1) {
            OnlineShopPanel.buyerlogin();
        }
    }

    public static ArrayList<SalePerson> sellersSignUp() {
        System.out.println("please enter your information: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("please choose an ID: ");
        String userName = sc.nextLine();
        for (SalePerson a : Admin.reallSellers) {
            while (userName.equals(a.getUserName())) {
                System.out.println("already taken , please choose another username");
                userName = sc.nextLine();
            }
        }
        System.out.println("please enter your company name: ");
        String companyName = sc.nextLine();
        System.out.println("please enter your company registration code");
        String companyNo = sc.nextLine();
        System.out.println("done! now please enter your name: ");
        String name = sc.nextLine();
        System.out.println("enter your lastName: ");
        String lastName = sc.nextLine();
        System.out.println("enter your E_mail adress: ");
        String email = sc.nextLine();
        System.out.println("enter your phone number: ");
        long phonenumber = sc.nextLong();
        System.out.println("well done! \n now please choose an strong password: ");
        sc.nextLine();
        String password = sc.nextLine();
        System.out.println("please reenter your password: ");
        String pass2 = sc.nextLine();
        while (!pass2.equals(password)) {
            System.out.println("passwords dosent match , try again");
            pass2 = sc.nextLine();
        }
        SalePerson seller = new SalePerson(userName, name, lastName, email, phonenumber, password, companyName, companyNo);
        sellers.add(seller);
        return sellers;
    }

    public static Buyer buyerlogin() {
        Buyer[] newbuyer = new Buyer[1];
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your username: ");
        String userName = sc.nextLine();
        for (Buyer a : buyers) {
            if (a.getUserName().equals(userName)) {
                System.out.println("please enter your password: ");
                String password = sc.nextLine();
                if (password.equals(a.getPassword())) {
                    newbuyer[0] = a;
                    Main.buyer = a;
                    BuyerPanel.panel(a);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
        return newbuyer[0];
    }

    public static void sellerLogin() {
        System.out.println("if you dont have account press 0 to sign up and if you want to log in to your account press 1:");
        Scanner sc = new Scanner(System.in);
        int zero = sc.nextInt();
        if (zero == 0) {
            OnlineShopPanel.sellersSignUp();
        } else if (zero == 1) {
            sc.nextLine();
            System.out.println("please enter your username: ");
            String userName = sc.nextLine();
            for (SalePerson a : Admin.reallSellers) {
                if (userName.equals(a.getUserName())) {
                    System.out.println("please enter your password: ");
                    String password = sc.nextLine();
                    if (password.equals(a.getPassword())) {
                        SellerPanel.panel(a);
                    }
                }
            }
        }
    }

}
