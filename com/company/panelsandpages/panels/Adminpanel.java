package com.company.panelsandpages.panels;

import com.company.MainMenu.OnlineShopPanel;
import com.company.entity.classes.*;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.MainMenu.OnlineShopPanel.buyers;

public class Adminpanel {
    void menu() {
        System.out.println("Welcome to admin panel\n" + "please choose what do you want to do: ");
        System.out.println("1-changing personal informatio");
        System.out.println("2-salesperson registration request ");
        System.out.println("3-products requests");
        System.out.println("4-view users list");
        System.out.println("5-delete a user ");
        System.out.println("6-categories list");
        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();
        switch (order) {
            case 1:
                chngeInfo();
                break;
            case 2:
                Adminpanel.addSeller(OnlineShopPanel.sellersSignUp());
                break;
            case 3:
                addGood(Admin.notConfirmedGoods);
                break;
            case 4:
                //
                break;
            case 5:
              deleteUser();
                break;
            case 6:
                //
                break;
        }
    }

    public static void addSeller(ArrayList<SalePerson> sellers) {
        System.out.println("for viewing the list press 1");
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int i = 1;
        if (one == 1) {
            int size = sellers.size();
            for (int j = 0; j < size; j++) {
                System.out.println(i + " company name: " + sellers.get(j).getCompanyName() + "\n company registration number: " + sellers.get(j).getCompanyNo() +
                        "\n name and last name: " + sellers.get(j).getName() + sellers.get(j).getLastName() + "\n E_mail adress: " + sellers.get(j).getEmail());
                i++;
            }
        }
        System.out.println("enter the number of requests you are going to accept now: ");
        int t = sc.nextInt();
        while (t > 0) {
            System.out.println("for accepting  requests enter their numbers: ");
            int number = sc.nextInt();
            number = -1;
            Admin.reallSellers.add(sellers.get(number));
            t--;
        }
    }
public static void addGood(  ArrayList<Goods> notConfirmedGoods){
        System.out.println("for viewing request list press one: ");
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int i=1;
        if(one ==1){
            for(Goods a: notConfirmedGoods)
            System.out.println(i+". "+a.getName() + "   "+a.getBrand()+"   "+a.getPrice()+"  "+a.getSellerCompanyName()+"   "+a.getSellerName());
            i++;
        }
        System.out.println("please tell me how many requests you are going to accept now");
        int t = sc.nextInt();
        while(t>0){
            System.out.println("now please tell me which product you are going to add:");
            System.out.println("1-Cell Phone\n2-Lop top\n3-Shirt\n4-Shoes\n5-Tv\n6-Refrigerator\n7-Oven\n8-Food");
            int category = sc.nextInt();
            switch (category){
                case 1:
                    System.out.println("please enter the number next to the product:");
                    int number = sc.nextInt();
                    number=number-1;
                    notConfirmedGoods.get(number).setConfirmStatus(true);
            }
        }
}
public void deleteUser(){
        System.out.println("for viewing users list press one:");
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int i=1;
        if(one ==1){
            for(Buyer a : OnlineShopPanel.buyers){
                System.out.println(i+". "+a.getUserName()+"   "+a.getName()+" "+a.getLastName()+"   "+a.getEmail()+"   "+a.getPhoneNumber());
                i++;
            }
            System.out.println("for deleting a user , enter the number next to each one:");
            int number = sc.nextInt();
            number=number-1;
            OnlineShopPanel.buyers.remove(number);
        }
}
public void viewUser(){
        //TODO clean console
    for(Buyer a : buyers){
        int i=1;
                System.out.println(i+". "+a.getUserName()+"   "+a.getName()+" "+a.getLastName()+"   "+a.getEmail()+"   "+a.getPhoneNumber());
                i++;
            }
    }

void chngeInfo(){
        String new1;
        long new3;
    System.out.println("I want to change my:");
    System.out.println("1-Name \n2-LastName \n3-E_mail\n4-PhoneNumber\n5-Password");
    Scanner sc = new Scanner(System.in);
    int order = sc.nextInt();
    switch (order){
        case 1:
            System.out.println("please enter your new name:");
            new1= sc.nextLine();
            Admin.newAdmin.setName(new1);
            System.out.println("done!");
            break;
        case 2:
            System.out.println("please enter your new lastname:");
            new1= sc.nextLine();
            Admin.newAdmin.setLastName(new1);
            System.out.println("done!");
            break;
        case 3:
            System.out.println("please enter your new Email adress: ");
            new1= sc.nextLine();
            Admin.newAdmin.setEmail(new1);
            System.out.println("done!");
            break;
        case 4:
            System.out.println("please enter your new phone number:");
            new3= sc.nextLong();
            Admin.newAdmin.setPhoneNumber(new3);
            System.out.println("done!");
            break;
        case 5:
            System.out.println("please enter your new password:");
            new1= sc.nextLine();
            System.out.println("please reenter your password: ");
            String pass2 = sc.nextLine();
            while (pass2 != new1) {
                System.out.println("passwords dosent match , try again");
                pass2 = sc.nextLine();
            }
            Admin.newAdmin.setPassword(new1);
            System.out.println("done!");
            break;

    }
}
}
