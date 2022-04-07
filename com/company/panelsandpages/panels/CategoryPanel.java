package com.company.panelsandpages.panels;

import com.company.entity.classes.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryPanel {
    public static ArrayList<CellPhone> cellPhones = new ArrayList<CellPhone>();
    public static ArrayList<Loptop> loptops = new ArrayList<Loptop>();
    public static ArrayList<Shirt> shirt = new ArrayList<Shirt>();
    public static ArrayList<Shoes> shoes = new ArrayList<Shoes>();
    public static ArrayList<TV> tvs = new ArrayList<TV>();
    public static ArrayList<Rifrigirator> rifrigirators = new ArrayList<Rifrigirator>();
    public static ArrayList<Oven> ovens = new ArrayList<Oven>();
    public static ArrayList<Food> foods = new ArrayList<Food>();

    public static void showProduct() {
        System.out.println("choose a category:");
        System.out.println("1-Digital Goods\n2-Clothes\n3-Home Applications\n4-Food products");
        Scanner sc = new Scanner(System.in);
        int category = sc.nextInt();
        switch (category) {
            case 1:
                //TODO cleaning console
                System.out.println("please choose :");
                System.out.println("1-Cell Phone\n2-Lop top");
                category = sc.nextInt();
                if (category == 1) {
                    int i = 1;
                    for (CellPhone a : cellPhones) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it: ");
                    int number = sc.nextInt();
                    number = number - 1;
                    //TODO product panel
                } else if (category == 2) {
                    int i = 1;
                    for (Loptop a : loptops) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it: ");
                    int number = sc.nextInt();
                    number = number - 1;
                    // TODO
                }

            case 2:
                //TODO cleaning
                System.out.println("please choose :");
                System.out.println("1-Shirt\n2-Shoes");
                category = sc.nextInt();
                if (category == 1) {
                    int i = 1;
                    for (Shirt a : shirt) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it: ");
                    int number = sc.nextInt();
                    number = number - 1;
                    // TODO
                } else if (category == 2) {
                    int i = 1;
                    for (Shoes a : shoes) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it: ");
                    int number = sc.nextInt();
                    number = number - 1;
                    // TODO
                }
            case 3:
                System.out.println("please choose:");
                System.out.println("1-Tvs\n2-Refrigerators\n3-Ovens");
                category = sc.nextInt();
                if (category == 1) {
                    int i = 1;
                    for (TV a : tvs) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it: ");
                    int number = sc.nextInt();
                    number = number - 1;
                    // TODO
                } else if (category == 2) {
                    int i = 1;
                    for (Rifrigirator a : rifrigirators) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it: ");
                    int number = sc.nextInt();
                    number = number - 1;
                    // TODO
                } else if (category == 3) {
                    int i = 1;
                    for (Oven a : ovens) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it: ");
                    int number = sc.nextInt();
                    number = number - 1;
                    // TODO
                }
            case 4:
                int i = 1;
                for (Food a : foods) {
                    if (a.isConfirmStatus() == true) {
                        System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                        i++;
                    }
                }
                System.out.println("for viewing each product enter the number next to it: ");
                int number = sc.nextInt();
                number = number - 1;
                // TODO
        }


    }
}
