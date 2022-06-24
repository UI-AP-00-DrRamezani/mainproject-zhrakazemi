package com.company.panels;

import com.company.entity.classes.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class WriteGoodInfo {
    public static void writeCellphoneInfo(CellPhone cellPhone) {
        Folders.createFolder("saved data\\products\\digital\\mobiles\\productsList\\mobile" + cellPhone.getGoodId());
        File file = new File("saved data\\products\\digital\\mobiles\\productsList\\mobile" + cellPhone.getGoodId() + "Info.txt");
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
        printWriter.println(cellPhone.getGoodId());
        printWriter.println(cellPhone.getName());
        printWriter.println(cellPhone.getBrand());
        printWriter.println(cellPhone.getPrice());
        printWriter.println(cellPhone.getSellerName());
        printWriter.println(cellPhone.isExist());
        printWriter.println(cellPhone.getInformation());
        printWriter.println(cellPhone.getAverageScore());
        printWriter.println(cellPhone.isConfirmStatus());
        printWriter.println(cellPhone.getMemory());
        printWriter.println(cellPhone.getRam());
        printWriter.println(cellPhone.getSystem());
        printWriter.println(cellPhone.getMass());
        printWriter.println(cellPhone.getSize());
        printWriter.println(cellPhone.getSimCard());
        printWriter.println(cellPhone.getCameraQuality());
        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + cellPhone.getSellerName() + "\\products list\\cellphone " + cellPhone.getGoodId());
        file1.mkdir();
        Path originalPath = Paths.get("saved data\\\\products\\\\digital\\\\mobiles\\\\productsList\\cellphone" + cellPhone.getGoodId() + "\\info.txt");
        Path copied = Paths.get("saved data\\users\\sellers\\seller " + cellPhone.getSellerName() + "\\products list\\cellphone " + cellPhone.getGoodId() + "\\info.txt");
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeLoptopInfo(Loptop loptop) {
        Folders.createFolder("saved data\\products\\digital\\laptops\\productsList" + loptop.getGoodId());
        File file = new File("saved data\\products\\digital\\laptops\\productsList\\loptop" + loptop.getGoodId() + "Info.txt");
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
        printWriter.println(loptop.getGoodId());
        printWriter.println(loptop.getName());
        printWriter.println(loptop.getBrand());
        printWriter.println(loptop.getPrice());
        printWriter.println(loptop.getSellerName());
        printWriter.println(loptop.isExist());
        printWriter.println(loptop.getInformation());
        printWriter.println(loptop.getAverageScore());
        printWriter.println(loptop.isConfirmStatus());
        printWriter.println(loptop.getMemory());
        printWriter.println(loptop.getRam());
        printWriter.println(loptop.getMass());
        printWriter.println(loptop.getSize());
        printWriter.println(loptop.isGaming());
        printWriter.println(loptop.getCPUModel());
        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + loptop.getSellerName() + "\\products list\\loptop " + loptop.getGoodId());
        file1.mkdir();
        Path originalPath = Paths.get("saved data\\products\\digital\\laptops\\productsList\\loptop" + loptop.getGoodId() + "\\info.txt");
        Path copied = Paths.get("saved data\\users\\sellers\\seller " + loptop.getSellerName() + "\\products list\\loptop " + loptop.getGoodId() + "\\info.txt");
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeRefrigeratorInfo(Rifrigirator rifrigirator) {
        Folders.createFolder("saved data\\products\\homeApplications\\refrigerators\\productsList" + rifrigirator.getGoodId());
        File file = new File("saved data\\products\\homeApplications\\refrigerators\\productsList" + rifrigirator.getGoodId() + "Info.txt");
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
        printWriter.println(rifrigirator.getGoodId());
        printWriter.println(rifrigirator.getName());
        printWriter.println(rifrigirator.getBrand());
        printWriter.println(rifrigirator.getPrice());
        printWriter.println(rifrigirator.getSellerName());
        printWriter.println(rifrigirator.isExist());
        printWriter.println(rifrigirator.getInformation());
        printWriter.println(rifrigirator.getAverageScore());
        printWriter.println(rifrigirator.isConfirmStatus());
        printWriter.println(rifrigirator.getCapacity());
        printWriter.println(rifrigirator.getEnergyUsage());
        printWriter.println(rifrigirator.getType());
        printWriter.println(rifrigirator.isWarranty());
        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + rifrigirator.getSellerName() + "\\products list\\Refrigerator " + rifrigirator.getGoodId());
        file1.mkdir();
        Path originalPath = Paths.get("saved data\\products\\homeApplications\\refrigerators\\productsList\\refrigerator" + rifrigirator.getGoodId() + "\\info.txt");
        Path copied = Paths.get("saved data\\users\\sellers\\seller " + rifrigirator.getSellerName() + "\\products list\\Refrigerator " + rifrigirator.getGoodId() + "\\info.txt");
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeTvInfo(TV tv) {
        Folders.createFolder("saved data\\products\\homeApplications\\TVs\\productsList" + tv.getGoodId());
        File file = new File("saved data\\products\\homeApplications\\TVs\\productsList" + tv.getGoodId() + "Info.txt");
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
        printWriter.println(tv.getGoodId());
        printWriter.println(tv.getName());
        printWriter.println(tv.getBrand());
        printWriter.println(tv.getPrice());
        printWriter.println(tv.getSellerName());
        printWriter.println(tv.isExist());
        printWriter.println(tv.getInformation());
        printWriter.println(tv.getAverageScore());
        printWriter.println(tv.isConfirmStatus());
        printWriter.println(tv.getPictureQuality());
        printWriter.println(tv.getEnergyUsage());
        printWriter.println(tv.getSize());
        printWriter.println(tv.isWarranty());
        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + tv.getSellerName() + "\\products list\\tv " + tv.getGoodId());
        file1.mkdir();
        Path originalPath = Paths.get("saved data\\products\\homeApplications\\TVs\\productsList\\tv" + tv.getGoodId() + "\\info.txt");
        Path copied = Paths.get("saved data\\users\\sellers\\seller " + tv.getSellerName() + "\\products list\\oven " + tv.getGoodId() + "\\info.txt");
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeOvenInfo(Oven oven) {
        Folders.createFolder("saved data\\products\\homeApplications\\ovens\\productsList" + oven.getGoodId());
        File file = new File("saved data\\products\\homeApplications\\ovens\\productsList" + oven.getGoodId() + "Info.txt");
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
        printWriter.println(oven.getGoodId());
        printWriter.println(oven.getName());
        printWriter.println(oven.getBrand());
        printWriter.println(oven.getPrice());
        printWriter.println(oven.getSellerName());
        printWriter.println(oven.isExist());
        printWriter.println(oven.getInformation());
        printWriter.println(oven.getAverageScore());
        printWriter.println(oven.isConfirmStatus());
        printWriter.println(oven.getOvenNumber());
        printWriter.println(oven.getEnergyUsage());
        printWriter.println(oven.getMaterial());
        printWriter.println(oven.isWarranty());
        printWriter.println(oven.isOven());
        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + oven.getSellerName() + "\\products list\\oven " + oven.getGoodId());
        file1.mkdir();
        Path originalPath = Paths.get("saved data\\products\\homeApplications\\ovens\\productsList\\oven" + oven.getGoodId() + "\\info.txt");
        Path copied = Paths.get("saved data\\users\\sellers\\seller " + oven.getSellerName() + "\\products list\\oven " + oven.getGoodId() + "\\info.txt");
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeShirtInfo(Shirt shirt) {
        Folders.createFolder("saved data\\products\\cloth\\shirts\\productsList" + shirt.getGoodId());
        File file = new File("saved data\\products\\cloth\\shirts\\productsList" + shirt.getGoodId() + "Info.txt");
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
        printWriter.println(shirt.getGoodId());
        printWriter.println(shirt.getName());
        printWriter.println(shirt.getBrand());
        printWriter.println(shirt.getPrice());
        printWriter.println(shirt.getSellerName());
        printWriter.println(shirt.isExist());
        printWriter.println(shirt.getInformation());
        printWriter.println(shirt.getAverageScore());
        printWriter.println(shirt.isConfirmStatus());
        printWriter.println(shirt.getSize());
        printWriter.println(shirt.getMaterial());

        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + shirt.getSellerName() + "\\products list\\shirt " + shirt.getGoodId());
        file1.mkdir();
        Path originalPath = Paths.get("saved data\\products\\cloth\\shirts\\productsList\\shirt" + shirt.getGoodId() + "\\info.txt");
        Path copied = Paths.get("saved data\\users\\sellers\\seller " + shirt.getSellerName() + "\\products list\\shirt " + shirt.getGoodId() + "\\info.txt");
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeShoesInfo(Shoes shoes) {
        Folders.createFolder("saved data\\products\\cloth\\shoes\\productsList" + shoes.getGoodId());
        File file = new File("saved data\\products\\cloth\\shirts\\productsList" + shoes.getGoodId() + "Info.txt");
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
        printWriter.println(shoes.getGoodId());
        printWriter.println(shoes.getName());
        printWriter.println(shoes.getBrand());
        printWriter.println(shoes.getPrice());
        printWriter.println(shoes.getSellerName());
        printWriter.println(shoes.isExist());
        printWriter.println(shoes.getInformation());
        printWriter.println(shoes.getAverageScore());
        printWriter.println(shoes.isConfirmStatus());
        printWriter.println(shoes.getSize());
        printWriter.println(shoes.getMaterial());

        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + shoes.getSellerName() + "\\products list\\shoes " + shoes.getGoodId());
        file1.mkdir();
        Path originalPath = Paths.get("saved data\\products\\cloth\\shoes\\productsList\\shoes" + shoes.getGoodId() + "\\info.txt");
        Path copied = Paths.get("saved data\\users\\sellers\\seller " + shoes.getSellerName() + "\\products list\\shoes " + shoes.getGoodId() + "\\info.txt");
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFoodInfo(Food food) {
        Folders.createFolder("saved data\\products\\foods\\productsList" + food.getGoodId());
        File file = new File("saved data\\products\\foods\\productsList" + food.getGoodId() + "Info.txt");
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
        printWriter.println(food.getGoodId());
        printWriter.println(food.getName());
        printWriter.println(food.getBrand());
        printWriter.println(food.getPrice());
        printWriter.println(food.getSellerName());
        printWriter.println(food.isExist());
        printWriter.println(food.getInformation());
        printWriter.println(food.getAverageScore());
        printWriter.println(food.isConfirmStatus());
        printWriter.println(food.getProductioDate());
        printWriter.println(food.getExpiryDate());

        printWriter.close();
        File file1 = new File("saved data\\users\\sellers\\seller " + food.getSellerName() + "\\products list\\food " + food.getGoodId());
        file1.mkdir();
        Path originalPath = Paths.get("saved data\\products\\foods\\productsList\\food" + food.getGoodId() + "\\info.txt");
        Path copied = Paths.get("saved data\\users\\sellers\\seller " + food.getSellerName() + "\\products list\\food " + food.getGoodId() + "\\info.txt");
        try {
            Files.copy(originalPath, copied, REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}