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
public static void manu(){
    System.out.println("choose an option:");
    System.out.println("1-viewing whole products\n2-viewing products by searching their name\n");
    Scanner sc = new Scanner(System.in);
    int choose = sc.nextInt();
    switch (choose) {
        case 1:
            showProduct();
            break;
        case 2:
            searchProducts();
            break;
    }
}
    public static void showProduct() {
        ArrayList<Goods> goods = new ArrayList<>();
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
                    System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                            " press 0 :");
                    int number = sc.nextInt();
                    if(number==0) {
                        for (Goods a : cellPhones) {
                            goods.add(a);
                        }
                        brandFiltering(goods);
                    }
                    else {
                        number = number - 1;
                        //TODO product panel
                    }
                } else if (category == 2) {
                    int i = 1;
                    for (Loptop a : loptops) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                            " press 0 :");
                    int number = sc.nextInt();
                    if(number==0) {
                        for (Goods a : loptops) {
                            goods.add(a);
                        }
                        brandFiltering(goods);
                    }
                    else {
                        number = number - 1;
                        //TODO product panel
                    }
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
                    System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                            " press 0 :");
                    int number = sc.nextInt();
                    if(number==0) {
                        for (Goods a : shirt) {
                            goods.add(a);
                        }
                        brandFiltering(goods);
                    }
                    else {
                        number = number - 1;
                        //TODO product panel
                    }
                } else if (category == 2) {
                    int i = 1;
                    for (Shoes a : shoes) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                            " press 0 :");
                    int number = sc.nextInt();
                    if(number==0) {
                        for (Goods a : shoes) {
                            goods.add(a);
                        }
                        brandFiltering(goods);
                    }
                    else {
                        number = number - 1;
                        //TODO product panel
                    }
                }
            case 3:
                System.out.println("please choose:");
                System.out.println("1-Tvs\n2-Refrigerators\n3-Ovens");
                category = sc.nextInt();
                if (category == 1) {
                    int i = 1;
                    for (Goods a : tvs) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                            " press 0 :");
                    int number = sc.nextInt();
                    if(number==0) {
                        for (Goods a : tvs) {
                            goods.add(a);
                        }
                        brandFiltering(goods);
                    }
                    else {
                        number = number - 1;
                        //TODO product panel
                    }
                } else if (category == 2) {
                    int i = 1;
                    for (Rifrigirator a : rifrigirators) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                            " press 0 :");
                    int number = sc.nextInt();
                    if(number==0) {
                        for (Goods a : rifrigirators) {
                            goods.add(a);
                        }
                        brandFiltering(goods);
                    }
                    else {
                        number = number - 1;
                        //TODO product panel
                    }
                } else if (category == 3) {
                    int i = 1;
                    for (Oven a : ovens) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                            " press 0 :");
                    int number = sc.nextInt();
                    if (number == 0) {
                        for (Goods a : ovens) {
                            goods.add(a);
                        }
                        brandFiltering(goods);
                    } else {
                        number = number - 1;
                        //TODO product panel
                    }
                }
            case 4:
                int i = 1;
                for (Food a : foods) {
                    if (a.isConfirmStatus() == true) {
                        System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                        i++;
                    }
                }
                System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                        " press 0 :");
                int number = sc.nextInt();
                if(number==0) {
                    for (Goods a : foods) {
                        goods.add(a);
                    }
                    brandFiltering(goods);
                }
                else {
                    number = number - 1;
                    //TODO product panel
                }
        }
    }

    public static void searchProducts() {
        System.out.println("choose a category:");
        System.out.println("1-Cell Phone\n2-Lop top\n3-Shirt\n4-Shoes\n5-Tv\n6-Refrigerator\n7-Oven\n8-Food");
        Scanner sc = new Scanner(System.in);
        int category = sc.nextInt();
        System.out.println("enter name of product for search: ");
        String name = sc.nextLine();
        switch (category) {
            case 1:
                ArrayList<Goods > goods1 = new ArrayList<>();
                for(Goods a : cellPhones){
                    goods1.add(a);
                }
                CategoryPanel.showSearchResault(goods1 , name);
                break;
            case 2:
                ArrayList<Goods > goods = new ArrayList<>();
                for(Goods a : loptops){
                    goods.add(a);
                }
                CategoryPanel.showSearchResault(goods , name);
                break;
            case 3:
                ArrayList<Goods > goods2 = new ArrayList<>();
                for(Goods a : shirt){
                    goods2.add(a);
                }
                CategoryPanel.showSearchResault(goods2 , name);
                break;
            case 4:
                ArrayList<Goods > goods3 = new ArrayList<>();
                for(Goods a : shoes){
                    goods3.add(a);
                }
                CategoryPanel.showSearchResault(goods3 , name);
                break;
            case 5:
                ArrayList<Goods > goods4 = new ArrayList<>();
                for(Goods a : tvs){
                    goods4.add(a);
                }
                CategoryPanel.showSearchResault(goods4 , name);
                break;
            case 6:
                ArrayList<Goods > goods5 = new ArrayList<>();
                for(Goods a : rifrigirators){
                    goods5.add(a);
                }
                CategoryPanel.showSearchResault(goods5 , name);
                break;
            case 7:
                ArrayList<Goods > goods6 = new ArrayList<>();
                for(Goods a : ovens){
                    goods6.add(a);
                }
                CategoryPanel.showSearchResault(goods6 , name);
                break;
            case 8:
               ArrayList<Goods > goods7 = new ArrayList<>();
               for(Goods a : foods){
                   goods7.add(a);
               }
               CategoryPanel.showSearchResault(goods7 , name);
                break;
        }
    }
    public static void showSearchResault(ArrayList<Goods> goods  , String name){
        for (Goods c: goods) {
            if (c.isConfirmStatus() == true) {
                if (c.getName() == name) {
                    //TODO show product
                } else {
                    System.out.println("didnt found");
                }
            }
        }
    }
    public static void brandFiltering(ArrayList<Goods> goods ){
        ArrayList<Goods > resultGoods = new ArrayList<>();
        System.out.println("enter a Brand name");
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        for (Goods a : goods) {
            if (a.isConfirmStatus() == true) {
                if(a.getBrand()==brand){
                    resultGoods.add(a);
                }
            }
        }
        int i =1;
        for(Goods a : resultGoods){
                    System.out.println(i + ".  " + a.getName() + "  " + a.isExist() + "   " + a.getPrice());
                    i++;
                }
            System.out.println("for viewing each product enter the number next to it: ");
            int number = sc.nextInt();
            number = number - 1;
            // TODO
        }
}
