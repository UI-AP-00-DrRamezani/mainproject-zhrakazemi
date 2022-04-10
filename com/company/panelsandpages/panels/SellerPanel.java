package com.company.panelsandpages.panels;

import com.company.Main;
import com.company.MainMenu.FirstPagePanel;
import com.company.entity.classes.*;

import java.util.Scanner;

public class SellerPanel {
    public static void panel(SalePerson seller) {
        SellerPanel x = new SellerPanel();
        while (true) {
            System.out.println("wellcome!\nplease choose an option:");
            System.out.println("1-Change personal information\n2-Edit a product info\n3-Delete a product\n4-Add a product\n5-exit");
            Scanner sc = new Scanner(System.in);
            int order = sc.nextInt();
            switch (order) {
                case 1:
                    changeInfo(seller);
                    break;
                case 2:
                    //
                    break;
                case 3:
                    deleteGood(seller);
                    break;
                case 4:
                    x.addGood();
                    break;
                case 5:
                    FirstPagePanel.firstPage();
            }
        }
    }

    public void addGood() {
        System.out.println("please choose what kind of goods you want to add: ");
        System.out.println("1-Cell Phone\n2-Lop top\n3-Shirt\n4-Shoes\n5-Tv\n6-Refrigerator\n7-Oven\n8-Food");
        Scanner sc = new Scanner(System.in);
        int good = sc.nextInt();
        switch (good) {
            case 1:
                CellPhone tempphone = addCellphone();
                Admin.notConfirmedGoods.add(tempphone);
                CategoryPanel.cellPhones.add(tempphone);
                break;
            case 2:
                Loptop temploptop = addLoptop();
                Admin.notConfirmedGoods.add(temploptop);
                CategoryPanel.loptops.add(temploptop);
                break;
            case 3:
                Shirt tempShirt = addShirt();
                Admin.notConfirmedGoods.add(tempShirt);
                CategoryPanel.shirt.add(tempShirt);
                break;
            case 4:
                Shoes tempShoes = addshoe();
                Admin.notConfirmedGoods.add(tempShoes);
                CategoryPanel.shoes.add(tempShoes);
                break;
            case 5:
                TV tempTv = addTv();
                Admin.notConfirmedGoods.add(tempTv);
                CategoryPanel.tvs.add(tempTv);
                break;
            case 6:
                Rifrigirator tempref = addRefrigerator();
                Admin.notConfirmedGoods.add(tempref);
                CategoryPanel.rifrigirators.add(tempref);
                break;
            case 7:
                Oven tempOven = addOven();
                Admin.notConfirmedGoods.add(tempOven);
                CategoryPanel.ovens.add(tempOven);
                break;
            case 8:
                Food tempFood = addFood();
                Admin.notConfirmedGoods.add(tempFood);
                CategoryPanel.foods.add(tempFood);
                break;
        }
    }

    public CellPhone addCellphone() {
        System.out.println("please enter general information below: ");
        System.out.println("Id ,name , brand, price , existance status , information , company name , your name , " +
                "device memory , device ram , device system , device mass , device size");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        String brand = sc.nextLine();
        long price = sc.nextLong();
        boolean exist = sc.hasNext();
        sc.nextLine();
        String info = sc.nextLine();
        sc.nextLine();
        String sellerCompany = sc.nextLine();
        String sellerName = sc.nextLine();
        int memory = sc.nextInt();
        int ram = sc.nextInt();
        sc.nextLine();

        String system = sc.nextLine();
        double mass = sc.nextDouble();
        double size = sc.nextDouble();

        System.out.println("now please enter number of sim cards and camera quality:");
        int simcard = sc.nextInt();
        int cameraQuality = sc.nextInt();

        CellPhone temp = new CellPhone(id, name, brand, price, exist, info, sellerCompany,
                sellerName, memory, ram, system, mass, size, simcard, cameraQuality);
        return temp;
    }

    public Loptop addLoptop() {
        System.out.println("please enter general information below: ");
        System.out.println("Id ,name , brand, price , existance status , information , company name , your name , " +
                "device memory , device ram , device system , device mass , device size");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        String brand = sc.nextLine();
        long price = sc.nextLong();
        boolean exist = sc.hasNext();
        sc.nextLine();
        String info = sc.nextLine();
        sc.nextLine();
        String sellerCompany = sc.nextLine();
        String sellerName = sc.nextLine();
        int memory = sc.nextInt();
        int ram = sc.nextInt();
        sc.nextLine();

        String system = sc.nextLine();
        double mass = sc.nextDouble();
        double size = sc.nextDouble();
        sc.nextLine();
        System.out.println("now please enter CPU model and tell me if it is gaming or not: ");
        String CPU = sc.nextLine();
        boolean gaming = sc.hasNext();
        Loptop loptop = new Loptop(id, name, brand, price, exist, info,
                sellerCompany, sellerName, memory, ram, system, mass, size, CPU, gaming);
        return loptop;
    }

    public Shirt addShirt() {
        System.out.println("please enter general information below: ");
        System.out.println("Id ,name , brand, price , existance status , information , company name , your name , " +
                " country  and material");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        String brand = sc.nextLine();
        long price = sc.nextLong();
        boolean exist = sc.hasNext();
        sc.nextLine();
        String info = sc.nextLine();
        sc.nextLine();
        String sellerCompany = sc.nextLine();
        String sellerName = sc.nextLine();
        sc.nextLine();
        String countery = sc.nextLine();
        String material = sc.nextLine();
        System.out.println("now please enter size and shirt_type:");
        String size = sc.nextLine();
        String type = sc.nextLine();
        Shirt.clothType enumType = Shirt.clothType.valueOf(type);
        Shirt temp = new Shirt(id, name, brand, price, exist, info,
                sellerCompany, sellerName, countery, material, size, enumType);
        return temp;
    }

    public Shoes addshoe() {
        System.out.println("please enter general information below: ");
        System.out.println("Id ,name , brand, price , existance status , information , company name , your name , " +
                " country  and material");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        String brand = sc.nextLine();
        long price = sc.nextLong();
        boolean exist = sc.hasNext();
        sc.nextLine();
        String info = sc.nextLine();
        sc.nextLine();
        String sellerCompany = sc.nextLine();
        String sellerName = sc.nextLine();
        sc.nextLine();
        String countery = sc.nextLine();
        String material = sc.nextLine();
        System.out.println("now please enter size and shoes type: ");
        int size = sc.nextInt();
        sc.nextLine();
        String type = sc.nextLine();
        Shoes.shoeType enumType = Shoes.shoeType.valueOf(type);
        Shoes temp = new Shoes(id, name, brand, price, exist, info,
                sellerCompany, sellerName, countery, material, size, enumType);
        return temp;
    }

    public TV addTv() {
        System.out.println("please enter general information below: ");
        System.out.println("Id ,name , brand, price , existance status , information , company name , your name , " +
                "energy usage  and does it have warranty or not");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        String brand = sc.nextLine();
        long price = sc.nextLong();
        boolean exist = sc.hasNext();
        sc.nextLine();
        String info = sc.nextLine();
        sc.nextLine();
        String sellerCompany = sc.nextLine();
        String sellerName = sc.nextLine();
        sc.nextLine();
        String energy = sc.nextLine();
        boolean warranty = sc.hasNext();
        System.out.println("now please enter picture quality and its size:");
        int picQuality = sc.nextInt();
        int size = sc.nextInt();
        TV temp = new TV(id, name, brand, price, exist, info,
                sellerCompany, sellerName, energy, warranty, picQuality, size);
        return temp;
    }

    public Rifrigirator addRefrigerator() {
        System.out.println("please enter general information below: ");
        System.out.println("Id ,name , brand, price , existance status , information , company name , your name , " +
                "energy usage  and does it have warranty or not");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        String brand = sc.nextLine();
        long price = sc.nextLong();
        boolean exist = sc.hasNext();
        sc.nextLine();
        String info = sc.nextLine();
        sc.nextLine();
        String sellerCompany = sc.nextLine();
        String sellerName = sc.nextLine();
        sc.nextLine();
        String energy = sc.nextLine();
        boolean warranty = sc.hasNext();
        System.out.println("now please enter picture quality and its size:");
        int capacity = sc.nextInt();
        sc.nextLine();
        String type = sc.nextLine();
        boolean freezer = sc.hasNext();
        Rifrigirator temp = new Rifrigirator(id, name, brand, price, exist, info,
                sellerCompany, sellerName, energy, warranty, capacity, type, freezer);
        return temp;
    }

    public Oven addOven() {
        System.out.println("please enter general information below: ");
        System.out.println("Id ,name , brand, price , existance status , information , company name , your name , " +
                "energy usage  and does it have warranty or not");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        String brand = sc.nextLine();
        long price = sc.nextLong();
        boolean exist = sc.hasNext();
        sc.nextLine();
        String info = sc.nextLine();
        sc.nextLine();
        String sellerCompany = sc.nextLine();
        String sellerName = sc.nextLine();
        sc.nextLine();
        String energy = sc.nextLine();
        boolean warranty = sc.hasNext();
        System.out.println("now please enter picture quality and its size:");
        int ovenNumber = sc.nextInt();
        sc.nextLine();
        String material = sc.nextLine();
        boolean oven = sc.hasNext();
        Oven temp = new Oven(id, name, brand, price, exist, info,
                sellerCompany, sellerName, energy, warranty, ovenNumber, material, oven);
        return temp;
    }

    public Food addFood() {
        System.out.println("please enter general information below: ");
        System.out.println("Id ,name , brand, price , existance status , information , company name , your name ");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        String brand = sc.nextLine();
        long price = sc.nextLong();
        boolean exist = sc.hasNext();
        sc.nextLine();
        String info = sc.nextLine();
        sc.nextLine();
        String sellerCompany = sc.nextLine();
        String sellerName = sc.nextLine();
        System.out.println("now please enter production and expiry date:");
        String productionDate = sc.nextLine();
        String expiryDate = sc.nextLine();
        Food temp = new Food(id, name, brand, price, exist, info,
                sellerCompany, sellerName, productionDate, expiryDate);
        return temp;
    }

    public static void changeInfo(SalePerson seller) {
        String new1;
        long new3;
        System.out.println("I want to change my:");
        System.out.println("1-Name \n2-LastName \n3-E_mail\n4-PhoneNumber\n5-Password");
        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();
        int i = Admin.reallSellers.indexOf(seller);
        switch (order) {
            case 1:
                System.out.println("please enter your new name:");
                sc.nextLine();
                new1 = sc.nextLine();
                Admin.reallSellers.get(i).setName(new1);
                System.out.println("done!");
                break;
            case 2:
                System.out.println("please enter your new lastname:");
                sc.nextLine();
                new1 = sc.nextLine();
                Admin.reallSellers.get(i).setLastName(new1);
                System.out.println("done!");
                break;
            case 3:
                System.out.println("please enter your new Email adress: ");
                sc.nextLine();
                new1 = sc.nextLine();
                Admin.reallSellers.get(i).setEmail(new1);
                System.out.println("done!");
                break;
            case 4:
                System.out.println("please enter your new phone number:");
                new3 = sc.nextLong();
                Admin.reallSellers.get(i).setPhoneNumber(new3);
                System.out.println("done!");
                break;
            case 5:
                System.out.println("please enter your new password");
                sc.nextLine();
                new1 = sc.nextLine();
                System.out.println("please reenter your password: ");
                String pass2 = sc.nextLine();
                while (pass2 != new1) {
                    System.out.println("passwords dosent match , try again");
                    pass2 = sc.nextLine();
                }
                Admin.reallSellers.get(i).setPassword(new1);
                System.out.println("done!");
                break;

        }
    }

    public static void deleteGood(SalePerson seller) {
        System.out.println("please enter the number next to product you want to delete:");
        int i = 1;
        for (Goods a : seller.goods) {
            System.out.println(i + ".  " + a.getName() + "   " + a.getBrand() + "  " + a.getPrice());
            i++;
        }
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        number = number - 1;
        seller.deleteRequests.add(seller.goods.get(number));
    }

    public static void saleHistory(SalePerson seller) {
        long price = 0;
        for (Goods a : seller.saledGoods) {
            price = a.getPrice() + price;
        }
        Facture newFacture = new Facture("m145g", "21.1.1401", price, seller.getName(), "sent");
        System.out.println("facture No." + Facture.getFactureCod() + "      " + "Date: " + Facture.getFactureDate());
        System.out.println("--------------------products list-------------------");
        int i = 1;
        System.out.println();
        for (Goods a : seller.saledGoods) {
            System.out.println(i + " ." + a.getName() + "   " + a.getBrand() + "   " + a.getPrice() + "    " + a.getSellerCompanyName() + "   " + a.getSellerName());
        }
        System.out.println("----------------------------------------------------");

        System.out.println("send statuse: " + Facture.getFactureSendStatus());
    }
}

