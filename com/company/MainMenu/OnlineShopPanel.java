package com.company.MainMenu;

import com.company.Exceptions.InvalidDataException;
import com.company.Main;
import com.company.entity.classes.*;
import com.company.panelsandpages.panels.BuyerPanel;
import com.company.panelsandpages.panels.SellerPanel;
import com.company.panelsandpages.panels.WriteGoodInfo;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
        try {
            Buyer buyer = new Buyer(userName, name, lastName, email, phonenumber, password, money);
            buyers.add(buyer);
            OnlineShopPanel.writeClientInfo(buyer);
        } catch (InvalidDataException invalidDataException){
            System.out.println(invalidDataException.getMessage());
        }
        System.out.println("done! for entering System press one: ");
        int one;
        try {
        one = sc.nextInt();
        }catch (InputMismatchException mismatchException){
            System.out.println("The input type is incorrect");
            return;
        }
        if (one == 1) {
            OnlineShopPanel.buyerlogin();
        }
    }
    public  static void writeClientInfo(Buyer buyer){
        Folders.createFolder("saved data\\users\\buyers\\buyer"+buyer.getName());
        File file = new File("saved data\\users\\buyers\\buyer"+buyer.getName()+ "\\Info.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        printWriter.println(buyer.getUserName());
        printWriter.println(buyer.getName());
        printWriter.println(buyer.getLastName());
        printWriter.println(buyer.getEmail());
        printWriter.println(buyer.getPhoneNumber());
        printWriter.println(buyer.getPassword());
        printWriter.println(buyer.getMoney());

    }
    public static void sellersSignUp() {
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
        long phonenumber;
        try {
             phonenumber = sc.nextLong();
        }catch (InputMismatchException mismatchException){
            System.out.println("incorrect input type");
            return;
        }
        System.out.println("well done! \n now please choose an strong password: ");
        sc.nextLine();
        String password = sc.nextLine();
        System.out.println("please reenter your password: ");
        String pass2 = sc.nextLine();
        while (!pass2.equals(password)) {
            System.out.println("passwords dosent match , try again");
            pass2 = sc.nextLine();
        }
        try {
            SalePerson seller = new SalePerson(userName, name, lastName, email, phonenumber, password, companyName, companyNo);
            sellers.add(seller);
            writeRequestList();

        } catch (InvalidDataException invalidDataException){
            System.out.println(invalidDataException.getMessage());
        }
    }
    public  static void writeSellerInfo(SalePerson salePerson){
        Folders.createFolder("saved data\\users\\sellers\\seller"+ salePerson.getName());
        File file = new File("saved data\\users\\sellers\\seller"+ salePerson.getName() + "\\Info.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        printWriter.println(salePerson.getName());
        printWriter.println(salePerson.getLastName());
        printWriter.println(salePerson.getUserName());
        printWriter.println(salePerson.getPassword());
        printWriter.println(salePerson.getPhoneNumber());
        printWriter.println(salePerson.getEmail());
        printWriter.println(salePerson.getCompanyNo());
        printWriter.println(salePerson.getCompanyName());
        printWriter.close();

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
    private static void writeRequestList() {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("saved data\\users\\admin\\request.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            objectOutputStream.writeObject(sellers);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
