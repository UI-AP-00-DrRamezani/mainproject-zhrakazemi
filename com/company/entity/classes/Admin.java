package com.company.entity.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends GeneralAccount{
    //ArrayList<Student> students = new ArrayList<Student>();
//TODO لیست درخاست نظرات برای تایید شدن ،درخواست های فروشنده
     public static  ArrayList<SalePerson> reallSellers = new ArrayList<SalePerson>();

    public Admin(String userName, String name, String lastName, String email, long phoneNumber, String password) {
        super(userName, name, lastName, email, phoneNumber, password);
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
            reallSellers.add(sellers.get(number));
            t--;
        }
    }
}
