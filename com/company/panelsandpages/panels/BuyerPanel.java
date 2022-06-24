package com.company.panelsandpages.panels;

import com.company.Exceptions.InvalidEmailAddressException;
import com.company.Exceptions.InvalidPhoneNumberException;
import com.company.Exceptions.LackOfBudgetException;
import com.company.Main;
import com.company.entity.classes.Buyer;
import com.company.entity.classes.Goods;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

import static com.company.MainMenu.OnlineShopPanel.buyers;

public class BuyerPanel {
    public static void panel(Buyer buyer) {
        while (true) {
            System.out.println("if you want to change your information, press one and if you want to see products , press 0 \n 2-log out");
            Scanner sc = new Scanner(System.in);
            int one = -1;
            try {
                one = sc.nextInt();
            } catch (InputMismatchException mismatchException) {
                System.out.println("The input type is incorrect");
            }
            if (one == 1) {
                changeInfo(buyer);
            } else if (one == 2) {
                Main.buyer = null;
            } else if (one == 0) {
                CategoryPanel.manu();
            }
        }
    }

    public static void changeInfo(Buyer buyer) {
        String new1;
        long new3;
        System.out.println("I want to change my:");
        System.out.println("1-Name \n2-LastName \n3-E_mail\n4-PhoneNumber\n5-Password");
        Scanner sc = new Scanner(System.in);
        int order;
        try {
           order = sc.nextInt();
        }  catch (MissingFormatArgumentException missingFormatArgumentException){
            System.out.println("The input type is incorrect");
            return;
        }
        int i = buyers.indexOf(buyer);
        switch (order) {
            case 1:
                System.out.println("please enter your new name:");
                sc.nextLine();
                new1 = sc.nextLine();
                buyers.get(i).setName(new1);
                System.out.println("done!");
                break;
            case 2:
                System.out.println("please enter your new lastname:");
                sc.nextLine();
                new1 = sc.nextLine();
                buyers.get(i).setLastName(new1);
                System.out.println("done!");
                break;
            case 3:
                System.out.println("please enter your new Email adress: ");
                sc.nextLine();
                new1 = sc.nextLine();
                buyers.get(i).setEmail(new1);
                System.out.println("done!");
                break;
            case 4:
                System.out.println("please enter your new phone number:");
                try {
                    new3 = sc.nextLong();
                    try {
                        buyers.get(i).setPhoneNumber(new3);
                        System.out.println("done!");
                    }catch (InvalidPhoneNumberException invalidPhoneNumberException){
                        System.out.println(invalidPhoneNumberException.getMessage());
                    }
                }catch (InputMismatchException mismatchException){
                    System.out.println("The input type is incorrect");
                    return;
                }
                break;
            case 5:
                System.out.println("please enter your new password");
                sc.nextLine();
                new1 = sc.nextLine();
                System.out.println("please reenter your password: ");
                String pass2 = sc.nextLine();
                while (!pass2.equals(new1)) {
                    System.out.println("passwords dosent match , try again");
                    pass2 = sc.nextLine();
                }
                buyers.get(i).setPassword(new1);
                System.out.println("done!");
                break;

        }
    }

    public static void printFacture(ArrayList<Goods> goods) {
        long price = 0;
        for (Goods a : goods) {
            price = a.getPrice() + price;
        }
        String sellerName = goods.get(0).getSellerName();
        Facture newFacture = new Facture("m145g", price, sellerName, "waiting");
        System.out.println("facture No." + newFacture.getFactureCod() + "      " + "Date: " + newFacture.getFactureDate());
        System.out.println("--------------------products list-------------------");
        int i = 1;
        System.out.println();
        for (Goods a : goods) {
            System.out.println(i + " ." + a.getName() + "   " + a.getBrand() + "   " + a.getPrice() + "    " + a.getSellerCompanyName() + "   " + a.getSellerName());
        }
        System.out.println("----------------------------------------------------");

        System.out.println("send statuse: " + newFacture.getFactureSendStatus());
    }

    public static void cart(Buyer buyer) {
        System.out.println("------------------");
        int number = buyer.cart.size();
        System.out.println("number of products: " + number);
        int i = 1;
        System.out.println();
        for (Goods a : buyer.cart) {
            System.out.println(i + " ." + a.getName() + "   " + a.getBrand() + "   " + a.getPrice() + "    " + a.getSellerCompanyName() + "   " + a.getSellerName());
        }
        System.out.println("------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("to finish your shopping press 1 and for viewing products press0: ");
        int order;
        try {
            order = sc.nextInt();
        }catch (InputMismatchException mismatchException){
            System.out.println("The input type is incorrect");
            return;
        }
        if (order == 1) {
            try {
                FactureCommander.shopping(buyer);
            } catch (LackOfBudgetException lackOfBudgetException) {
                System.out.println(lackOfBudgetException.getMessage());
            }
        } else if (order == 0) {
            CategoryPanel.manu();
        }
    }
}

