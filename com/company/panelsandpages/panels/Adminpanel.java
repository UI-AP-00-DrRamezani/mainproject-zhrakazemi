package com.company.panelsandpages.panels;

import com.company.MainMenu.OnlineShopPanel;
import com.company.entity.classes.Admin;
import com.company.entity.classes.AdminCommander;
import com.company.entity.classes.SalePerson;

import java.util.ArrayList;
import java.util.Scanner;

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
                //
                break;
            case 2:
                Adminpanel.addSeller(OnlineShopPanel.sellersSignUp());
                break;
            case 3:
                //
                break;
            case 4:
                //
                break;
            case 5:
                //
                break;
            case 6:
                //
                break;
        }
    }
    public    static  void addSeller(ArrayList<SalePerson> sellers){
        System.out.println("for viewing the list press 1");
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int i = 1;
        if(one ==1) {
            int size = sellers.size();
            for (int j = 0 ; j< size ; j++) {
                System.out.println( i+" company name: " + sellers.get(j).getCompanyName() + "\n company registration number: " + sellers.get(j).getCompanyNo() +
                        "\n name and last name: " + sellers.get(j).getName() + sellers.get(j).getLastName() + "\n E_mail adress: " + sellers.get(j).getEmail());
                i++;
            }
        }
        System.out.println("enter the number of requests you are going to accept now: ");
        int t = sc.nextInt();
        while(t>0) {
            System.out.println("for accepting  requests enter their numbers: ");
            int number = sc.nextInt();
            number = -1;
            Admin.reallSellers.add(sellers.get(number));
            t--;
        }
    }
}

