package com.company.panels;

import com.company.Exceptions.InvalidPhoneNumberException;
import com.company.MainMenu.FirstPagePanel;
import com.company.entity.classes.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SellerPanel {
    public static void panel(SalePerson seller) {
        SellerPanel x = new SellerPanel();
        while (true) {
            System.out.println("wellcome!\nplease choose an option:");
            System.out.println("1-Change personal information\n2-Edit a product info\n3-Delete a product\n4-Add a product\n5-view your sale history\n6-exit");
            Scanner sc = new Scanner(System.in);
            int order = 0;
            try {
                order = sc.nextInt();
            } catch (InputMismatchException mismatchException) {
                System.out.println("The input type is incorrect");
            }
            switch (order) {
                case 1:
                    changeInfo(seller);
                    break;
                case 2:
                    changeProductInfo(seller);
                    break;
                case 3:
                    deleteGood(seller);
                    break;
                case 4:
                    x.addGood();
                    break;
                case 5:
                    saleHistory(seller);
                    break;
                case 6:
                    FirstPagePanel.firstPage();
                    break;
            }
        }
    }

    public void addGood() {
        System.out.println("please choose what kind of goods you want to add: ");
        System.out.println("1-Cell Phone\n2-Lop top\n3-Shirt\n4-Shoes\n5-Tv\n6-Refrigerator\n7-Oven\n8-Food");
        Scanner sc = new Scanner(System.in);
        int good = 0;
        try {
            good = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
        switch (good) {
            case 1:
                try {
                    CellPhone tempphone = addCellphone();
                    Admin.notConfirmedGoods.add(tempphone);
                    CategoryPanel.cellPhones.add(tempphone);
                    WriteGoodInfo.writeCellphoneInfo(tempphone);
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                    return;
                }
                break;
            case 2:
                try {
                    Loptop temploptop = addLoptop();
                    Admin.notConfirmedGoods.add(temploptop);
                    CategoryPanel.loptops.add(temploptop);
                    WriteGoodInfo.writeLoptopInfo(temploptop);
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                    return;
                }
                break;
            case 3:
                try {
                    Shirt tempShirt = addShirt();
                    Admin.notConfirmedGoods.add(tempShirt);
                    CategoryPanel.shirt.add(tempShirt);
                    WriteGoodInfo.writeShirtInfo(tempShirt);
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                    return;
                }
                break;
            case 4:
                try {
                    Shoes tempShoes = addshoe();
                    Admin.notConfirmedGoods.add(tempShoes);
                    CategoryPanel.shoes.add(tempShoes);
                    WriteGoodInfo.writeShoesInfo(tempShoes);
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                    return;
                }
                break;
            case 5:
                try {
                    TV tempTv = addTv();
                    Admin.notConfirmedGoods.add(tempTv);
                    CategoryPanel.tvs.add(tempTv);
                    WriteGoodInfo.writeTvInfo(tempTv);
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                    return;
                }
                break;
            case 6:
                try {
                    Rifrigirator tempref = addRefrigerator();
                    Admin.notConfirmedGoods.add(tempref);
                    CategoryPanel.rifrigirators.add(tempref);
                    WriteGoodInfo.writeRefrigeratorInfo(tempref);
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                    return;
                }
                break;
            case 7:
                try {
                    Oven tempOven = addOven();
                    Admin.notConfirmedGoods.add(tempOven);
                    CategoryPanel.ovens.add(tempOven);
                    WriteGoodInfo.writeOvenInfo(tempOven);
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                    return;
                }
                break;
            case 8:
                try {
                    Food tempFood = addFood();
                    Admin.notConfirmedGoods.add(tempFood);
                    CategoryPanel.foods.add(tempFood);
                    WriteGoodInfo.writeFoodInfo(tempFood);
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                    return;
                }
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
        boolean exist = sc.nextBoolean();
        sc.nextLine();
        String info = sc.nextLine();
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
        boolean exist = sc.nextBoolean();
        sc.nextLine();
        String info = sc.nextLine();
        String sellerCompany = sc.nextLine();
        String sellerName = sc.nextLine();
        int memory = sc.nextInt();
        int ram = sc.nextInt();
        sc.nextLine();
        String system = sc.nextLine();
        double mass = sc.nextDouble();
        double size = sc.nextDouble();
        System.out.println("now please enter CPU model and tell me if it is gaming or not: ");
        String CPU = sc.nextLine();
        boolean gaming = sc.nextBoolean();
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
        boolean exist = sc.nextBoolean();
        sc.nextLine();
        String info = sc.nextLine();
        String sellerCompany = sc.nextLine();
        String sellerName = sc.nextLine();
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
        boolean exist = sc.nextBoolean();
        sc.nextLine();
        String info = sc.nextLine();
        String sellerCompany = sc.nextLine();
        String sellerName = sc.nextLine();
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
        boolean exist = sc.nextBoolean();
        sc.nextLine();
        String info = sc.nextLine();
        String sellerCompany = sc.nextLine();
        String sellerName = sc.nextLine();
        String energy = sc.nextLine();
        boolean warranty = sc.nextBoolean();
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
        boolean exist = sc.nextBoolean();
        sc.nextLine();
        String info = sc.nextLine();
        String sellerCompany = sc.nextLine();
        String sellerName = sc.nextLine();
        String energy = sc.nextLine();
        sc.nextLine();
        boolean warranty = sc.nextBoolean();
        System.out.println("now please enter its capacity and is it a freezer or not:");
        int capacity = sc.nextInt();
        sc.nextLine();
        String type = sc.nextLine();
        boolean freezer = sc.nextBoolean();
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
        boolean exist = sc.nextBoolean();
        sc.nextLine();
        String info = sc.nextLine();
        String sellerCompany = sc.nextLine();
        String sellerName = sc.nextLine();
        String energy = sc.nextLine();
        boolean warranty = sc.nextBoolean();
        ;
        System.out.println("now please enter its oven number and material and does it have oven or not:");
        int ovenNumber = sc.nextInt();
        sc.nextLine();
        String material = sc.nextLine();
        boolean oven = sc.nextBoolean();
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
        boolean exist = sc.nextBoolean();
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
        int order;
        try {
            order = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
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
                try {
                    new3 = sc.nextLong();
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                    return;
                }
                try {
                    Admin.reallSellers.get(i).setPhoneNumber(new3);
                } catch (InvalidPhoneNumberException invalidPhoneNumberException){
                    System.out.println(invalidPhoneNumberException.getMessage());
                    return;
                }
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
        int number;
        try {
            number = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
        number = number - 1;
        seller.deleteRequests.add(seller.goods.get(number));
    }

    public static void saleHistory(SalePerson seller) {
        long price = 0;
        for (Goods a : seller.saledGoods) {
            price = a.getPrice() + price;
        }
        Facture newFacture = new Facture("m145g", price, seller.getName(), "sent");
        System.out.println("facture No." + newFacture.getFactureCod() + "      " + "Date: " + newFacture.getFactureDate());
        System.out.println("--------------------products list-------------------");
        int i = 1;
        System.out.println();
        for (Goods a : seller.saledGoods) {
            System.out.println(i + " ." + a.getName() + "   " + a.getBrand() + "   " + a.getPrice() + "    " + a.getSellerCompanyName() + "   " + a.getSellerName());
        }
        System.out.println("----------------------------------------------------");

        System.out.println("send statuse: " + newFacture.getFactureSendStatus());
    }

    public static void changeProductInfo(SalePerson seller) {
        int i = 1;
        for (Goods a : seller.saledGoods) {
            System.out.println(i + " ." + a.getName() + "   " + a.getBrand() + "   " + a.getPrice());
        }
        System.out.println("now please enter the number next to each product you want to change info:");
        Scanner sc = new Scanner(System.in);
        int number;
        try {
            number = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
        number = number - 1;
        seller.saledGoods.get(number).setConfirmStatus(false);
        Admin.chngedProducts.add(seller.saledGoods.get(number));

        System.out.println("now please choose wich one do you want to change:\n1-product name\n2-product price");
        int choose;
        try {
            choose = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
        switch (choose) {
            case 1:
                System.out.println("please enter new name");
                sc.nextLine();
                String newName = sc.nextLine();
                seller.saledGoods.get(number).setName(newName);
                break;
            case 2:
                System.out.println("please enter new price");
                try {
                    long price = sc.nextLong();
                    seller.saledGoods.get(number).setPrice(price);
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                    return;
                }
                break;
        }
    }
}

