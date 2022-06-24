package com.company.entity.classes;

import com.company.MainMenu.OnlineShopPanel;
import com.company.panelsandpages.panels.CategoryPanel;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class readData implements Serializable {
    public static void readData() {
        readSellerInfo();
        readClientInfo();
        readCellPhoneData();
        readloptopData();
        readRequest();
    }

    public static void readSellerInfo() {
        File file = new File("saved data\\users\\sellers");
        String[] sellers = file.list();
        for (String a : sellers) {
            File seller = new File("saved data\\users\\sellers\\" + a + "\\info.txt");
            Scanner sc;
            try {
                sc = new Scanner(seller);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            String name = sc.nextLine();
            String lastname = sc.nextLine();
            String username = sc.nextLine();
            String password = sc.nextLine();
            long phone = sc.nextLong();
            sc.nextLine();
            String email = sc.nextLine();
            String companyName = sc.nextLine();
            String companyNo = sc.nextLine();
            SalePerson salePerson = new SalePerson(username, name, lastname, email,
                    phone, password, companyName, companyNo);
            Admin.reallSellers.add(salePerson);
        }
    }

    public static void readClientInfo() {
        File file = new File("saved data\\users\\buyers");
        String[] buyers = file.list();
        for (String a : buyers) {
            File buyer = new File("saved data\\users\\buyers" + a + "info.txt");
            Scanner sc;
            try {
                sc = new Scanner(buyer);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            String username = sc.nextLine();
            String name = sc.nextLine();
            String lastname = sc.nextLine();
            String email = sc.nextLine();
            long phone = sc.nextLong();
            sc.nextLine();
            String password = sc.nextLine();
            long money = sc.nextLong();
            Buyer buyer1 = new Buyer(username, name, lastname, email,
                    phone, password, money);
            OnlineShopPanel.buyers.add(buyer1);
        }
    }

    public static void readCellPhoneData() {
        File file = new File("saved data\\products\\digital\\mobiles\\productsList");
        String[] cellphones = file.list();
        for (String a : cellphones) {
            File celphone = new File("saved data\\products\\digital\\mobiles\\productsList\\" + a + "info.txt");
            Scanner sc;
            try {
                sc = new Scanner(celphone);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            String id = sc.nextLine();
            String name = sc.nextLine();
            String brand = sc.nextLine();
            long price = sc.nextLong();
            boolean exist = sc.hasNext();
            sc.nextLine();
            String information = sc.nextLine();
            String companyName = sc.nextLine();
            String sellerName = sc.nextLine();
            int memory = sc.nextInt();
            int ram = sc.nextInt();
            sc.nextLine();
            String system = sc.nextLine();
            double mass = sc.nextDouble();
            double size = sc.nextDouble();
            int simcard = sc.nextInt();
            int cameraQuality = sc.nextInt();
            CellPhone cellPhone = new CellPhone(id, name, brand, price, exist, information, companyName,
                    sellerName, memory, ram, system, mass, size, simcard, cameraQuality);
            Admin.notConfirmedGoods.add(cellPhone);
            CategoryPanel.cellPhones.add(cellPhone);
        }

    }

    public static void readloptopData() {
        File file = new File("saved data\\products\\digital\\laptops\\productsList");
        String[] loptops = file.list();
        for (String a : loptops) {
            File celphone = new File("saved data\\products\\digital\\laptops\\productsList\\" + a + "info.txt");
            Scanner sc;
            try {
                sc = new Scanner(celphone);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            String id = sc.nextLine();
            String name = sc.nextLine();
            String brand = sc.nextLine();
            long price = sc.nextLong();
            boolean exist = sc.hasNext();
            sc.nextLine();
            String information = sc.nextLine();
            String companyName = sc.nextLine();
            String sellerName = sc.nextLine();
            int memory = sc.nextInt();
            int ram = sc.nextInt();
            sc.nextLine();
            String system = sc.nextLine();
            double mass = sc.nextDouble();
            double size = sc.nextDouble();
            sc.nextLine();
            String cpumodel = sc.nextLine();
            boolean gaming = sc.hasNext();
            Loptop loptop = new Loptop(id, name, brand, price, exist, information, companyName,
                    sellerName, memory, ram, system, mass, size, cpumodel, gaming);
            Admin.notConfirmedGoods.add(loptop);
            CategoryPanel.loptops.add(loptop);
        }

    }

    private static void readRequest() {
        FileInputStream fileInputStream;
        File file = new File("saved data\\users\\admin\\request.txt");
        if (file.exists()) {
            try {
                fileInputStream = new FileInputStream("saved data\\users\\admin\\request.txt");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            ObjectInputStream objectInputStream;
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                OnlineShopPanel.sellers = (ArrayList<SalePerson>) objectInputStream.readObject();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
