package com.company.panelsandpages.panels;

import com.company.entity.classes.Admin;
import com.company.entity.classes.Buyer;
import com.company.entity.classes.GeneralAccount;
import com.company.MainMenu.OnlineShopPanel;
import com.company.entity.classes.Goods;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.MainMenu.OnlineShopPanel.buyers;
import static com.company.MainMenu.OnlineShopPanel.goods;

public class BuyerPanel {
    public static void panel(Buyer buyer){
System.out.println("if you want to change your information, press one");
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        if(one==1){
            changeInfo(buyer);
        }
        else{
          CategoryPanel.showProduct();
           }
        }
   public static void changeInfo(Buyer buyer){
        String new1;
        long new3;
        System.out.println("I want to change my:");
        System.out.println("1-Name \n2-LastName \n3-E_mail\n4-PhoneNumber\n5-Password");
        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();
        int i = buyers.indexOf(buyer);
        switch (order){
            case 1:
                System.out.println("please enter your new name:");
                 new1= sc.nextLine();
                buyers.get(i).setName(new1);
                System.out.println("done!");
                break;
            case 2:
                System.out.println("please enter your new lastname:");
                new1= sc.nextLine();
                buyers.get(i).setLastName(new1);
                System.out.println("done!");
                break;
            case 3:
                System.out.println("please enter your new Email adress: ");
                new1= sc.nextLine();
                buyers.get(i).setEmail(new1);
                System.out.println("done!");
                break;
            case 4:
                System.out.println("please enter your new phone number:");
                new3= sc.nextLong();
              buyers.get(i).setPhoneNumber(new3);
                System.out.println("done!");
                break;
            case 5:
                System.out.println("please enter your new password");
                new1= sc.nextLine();
                System.out.println("please reenter your password: ");
                String pass2 = sc.nextLine();
                while (pass2 != new1) {
                    System.out.println("passwords dosent match , try again");
                    pass2 = sc.nextLine();
                }
               buyers.get(i).setPassword(new1);
                System.out.println("done!");
                break;

        }
    }

    public static void printFacture(ArrayList<Goods> goods){
        System.out.println("facture No." +BuyerCommander.getFactureCod()+"      "+"Date: " + BuyerCommander.getFactureDate());
        System.out.println("--------------------products list-------------------");
        int i=1;
        System.out.println();
        for(Goods a :goods){
            System.out.println(i +" ."+ a.getName() +"   "+a.getBrand()+"   "+a.getPrice()+"    "+a.getSellerCompanyName()+"   "+a.getSellerName());
        }
        System.out.println("----------------------------------------------------");

        System.out.println("send statuse: "+ BuyerCommander.getFactureSendStatus());
    }
}

