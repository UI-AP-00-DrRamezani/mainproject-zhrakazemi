package com.company.MainMenu;

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
  public static  ArrayList<SalePerson> sellers = new ArrayList<SalePerson>();
public static ArrayList<Goods> goods = new ArrayList<Goods>();

  public static   void clientSignUp() {
        System.out.println("please enter your information: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("please choose an ID: ");
        String userName = sc.nextLine();
        for (Buyer a : buyers) {
            while (userName ==a.getUserName()) {
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
        System.out.println("well done! \n now please choose an strong password: ");
        String password = sc.nextLine();
        System.out.println("please reenter your password: ");
        String pass2 = sc.nextLine();
        while (pass2 != password) {
            System.out.println("passwords dosent match , try again");
            pass2 = sc.nextLine();
        }
        System.out.println("done! for entering System press one: ");
        int one = sc.nextInt();
        if (one == 1) {
            login();
        }
    }

   public static ArrayList<SalePerson> sellersSignUp() {
        System.out.println("please enter your information: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("please choose an ID: ");
        String userName = sc.nextLine();
        for (SalePerson a : Admin.reallSellers) {
            while (userName == a.getUserName()) {
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
        String password = sc.nextLine();
        System.out.println("please reenter your password: ");
        String pass2 = sc.nextLine();
        while (pass2 != password) {
            System.out.println("passwords dosent match , try again");
            pass2 = sc.nextLine();
        }
        SalePerson seller = new SalePerson(userName, name, lastName, email, phonenumber, password, companyName, companyNo);
        sellers.add(seller);
        return  sellers;
    }

    public static void login() {
        System.out.println("please choose which one are you  ");
        System.out.println("1- Client \n2-Salesperson");
        Scanner sc = new Scanner(System.in);
        int role = sc.nextInt();
        if (role == 1) {
            System.out.println("if you dont have account press 0 to sign up:");
            int zero = sc.nextInt();
            if (zero == 0) {OnlineShopPanel.clientSignUp();}
                System.out.println("please enter your username: ");
                String userName = sc.nextLine();
                for (Buyer a : buyers) {
                    if (userName == a.getUserName()) {
                        System.out.println("please enter your password: ");
                        String password = sc.nextLine();
                        if (password == a.getPassword()) {
                            BuyerPanel.panel(a);
                        }
                    }
                }
            } else if (role == 2) {
            System.out.println("if you dont have account press 0 to sign up:");
            int zero = sc.nextInt();
            if (zero == 0) {
                OnlineShopPanel.sellersSignUp();}
                System.out.println("please enter your username: ");
                String userName = sc.nextLine();
                for (SalePerson a : Admin.reallSellers) {
                    if (userName == a.getUserName()) {
                        System.out.println("please enter your password: ");
                        String password = sc.nextLine();
                        if (password == a.getPassword()) {
                            SellerPanel.panel(a);
                        }
                    }
                }
            }
        }
    }
