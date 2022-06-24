package com.company.panelsandpages.panels;

import com.company.Exceptions.InvalidEmailAddressException;
import com.company.Exceptions.InvalidPhoneNumberException;
import com.company.Main;
import com.company.MainMenu.OnlineShopPanel;
import com.company.entity.classes.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.MainMenu.OnlineShopPanel.buyers;

public class AdminPanel {
    public static void menu() {
        while (true) {
            System.out.println("Welcome to admin panel\n" + "please choose what do you want to do: ");
            System.out.println("1-changing personal information");
            System.out.println("2-salesperson registration request ");
            System.out.println("3-products requests");
            System.out.println("4-view users list");
            System.out.println("5-delete a user ");
            System.out.println("6-categories list");
            System.out.println("7-accepting changed products");
            System.out.println("8-log out");
            Scanner sc = new Scanner(System.in);
            int order = 0;
            try {
                order = sc.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("The input type is incorrect");
            }
            switch (order) {
                case 1:
                    AdminPanel.chngeInfo();
                    break;
                case 2:
                    AdminPanel.addSeller(OnlineShopPanel.sellers);
                    break;
                case 3:
                    System.out.println("1-add a product\n2-delete a product");
                    try {
                        order = sc.nextInt();
                        if (order == 1) {
                            addGood(Admin.notConfirmedGoods);
                        } else if (order == 2) {
                            AdminPanel.deleteGood();
                        }
                    } catch (InputMismatchException mismatchException) {
                        System.out.println("The input type is incorrect");
                    }
                    break;
                case 4:
                    AdminPanel.viewUser();
                    break;
                case 5:
                    AdminPanel.deleteUser();
                    break;
                case 6:
                    CategoryPanel.manu();
                    break;
                case 7:
                    addGood(Admin.chngedProducts);
                    break;
                case 8:
                    return;
            }
        }
    }

    public static void addSeller(ArrayList<SalePerson> sellers) {
        System.out.println("for viewing the list press 1");
        Scanner sc = new Scanner(System.in);
        int one;
        try {
            one = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
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
        int t;
        try {
            t = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
        while (t > 0) {
            System.out.println("for accepting  requests enter their numbers: ");
            int number;
            try {
                number = sc.nextInt();
            } catch (InputMismatchException mismatchException) {
                System.out.println("The input type is incorrect");
                return;
            }
            number -= 1;
            Admin.reallSellers.add(sellers.get(number));
            OnlineShopPanel.writeSellerInfo(sellers.get(number));
            sellers.remove(number);
            t--;
        }
    }
        public static void writeSellersInfo(SalePerson salePerson) {
            Folders.createFolder("saved data\\users\\sellers\\seller" + salePerson.getName());
            Folders.createFolder("saved data\\users\\sellers\\seller" + salePerson.getName() + "\\productList");
            File file = new File("saved data\\users\\sellers\\seller" + salePerson.getName() + "Info.txt");
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
            printWriter.println(salePerson.getUserName());
            printWriter.println(salePerson.getName());
            printWriter.println(salePerson.getLastName());
            printWriter.println(salePerson.getEmail());
            printWriter.println(salePerson.getPhoneNumber());
            printWriter.println(salePerson.getPassword());
            printWriter.println(salePerson.getCompanyName());
            printWriter.println(salePerson.getCompanyNo());
            printWriter.close();

        }
    public static void addGood(ArrayList<Goods> notConfirmedGoods) {
        System.out.println("for viewing request list press one: ");
        Scanner sc = new Scanner(System.in);
        int one;
        try {
            one = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
        int i = 1;
        if (one == 1) {
            for (Goods a : notConfirmedGoods)
                System.out.println(i++ + ". " + a.getName() + "   " + a.getBrand() + "   " + a.getPrice() + "  " + a.getSellerCompanyName() + "   " + a.getSellerName());
        }
        System.out.println("please tell me how many requests you are going to accept now");
        int t;
        try {
            t = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
        while (t > 0) {

            System.out.println("please enter the number next to the product:");
            int number;
            try {
                number = sc.nextInt();
            } catch (InputMismatchException mismatchException) {
                System.out.println("The input type is incorrect");
                return;
            }
            number = number - 1;
            notConfirmedGoods.get(number).setConfirmStatus(true);
            Admin.realGoods.add(notConfirmedGoods.get(number));
            t--;
        }
    }

    public static void deleteUser() {
        System.out.println("for viewing users list press one:");
        Scanner sc = new Scanner(System.in);
        int one;
        try {
            one = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
        int i = 1;
        if (one == 1) {
            for (Buyer a : OnlineShopPanel.buyers) {
                System.out.println(i + ". " + a.getUserName() + "   " + a.getName() + " " + a.getLastName() + "   " + a.getEmail() + "   " + a.getPhoneNumber());
                i++;
            }
            System.out.println("for deleting a user , enter the number next to each one:");
            int number;
            try {
                number = sc.nextInt();
            } catch (InputMismatchException mismatchException) {
                System.out.println("The input type is incorrect");
                return;
            }
            number = number - 1;
            OnlineShopPanel.buyers.remove(number);
        }
    }

    public static void viewUser() {
        for (Buyer a : buyers) {
            int i = 1;
            System.out.println(i + ". " + a.getUserName() + "   " + a.getName() + " " + a.getLastName() + "   " + a.getEmail() + "   " + a.getPhoneNumber());
            i++;
        }
    }

    public static void chngeInfo() {
        String new1;
        long new3;
        System.out.println("I want to change my:");
        System.out.println("1-Name \n2-LastName \n3-E_mail\n4-PhoneNumber\n5-Password");
        Scanner sc = new Scanner(System.in);
        int order;
        try {
            order = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
        switch (order) {
            case 1:
                System.out.println("please enter your new name:");
                new1 = sc.nextLine();
                Admin.newAdmin.setName(new1);
                System.out.println("done!");
                break;
            case 2:
                System.out.println("please enter your new lastname:");
                new1 = sc.nextLine();
                Admin.newAdmin.setLastName(new1);
                System.out.println("done!");
                break;
            case 3:
                System.out.println("please enter your new Email adress: ");
                new1 = sc.nextLine();
                try {
                    Admin.newAdmin.setEmail(new1);
                    System.out.println("done!");
                } catch (InvalidEmailAddressException invalidEmailAddressException) {
                    System.out.println(invalidEmailAddressException.getMessage());
                }
                break;
            case 4:
                System.out.println("please enter your new phone number:");
                try {
                    new3 = sc.nextLong();
                    try {
                        Admin.newAdmin.setPhoneNumber(new3);
                        System.out.println("done!");
                    } catch (InvalidPhoneNumberException phoneNumberException) {
                        System.out.println(phoneNumberException.getMessage());
                    }
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                }
                break;
            case 5:
                System.out.println("please enter your new password:");
                new1 = sc.nextLine();
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

    public static void deleteGood() {
        System.out.println("choose a sale person first:");
        System.out.println("enter a seller name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int i = 1;
        for (SalePerson a : Admin.reallSellers) {
            if (a.getName().equals( name)) {
                System.out.println("for deleting each product enter the number next to it: ");
                for (Goods b : a.deleteRequests) {
                    System.out.println(i + ". " + b.getName() + "   " + b.getBrand() + "   " + b.getPrice());
                    i++;
                }
                int number;
                try {
                    number = sc.nextInt();
                }catch (InputMismatchException mismatchException){
                    System.out.println("The input type is incorrect");
                    return;
                }
                number = number - 1;
                a.deleteRequests.remove(number);
            }

        }
    }
}
