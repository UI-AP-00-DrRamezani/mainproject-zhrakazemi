package com.company.entity.classes;

import java.io.File;

public class Folders {
    public static void creatFolders() {
        createFolder("saved data");
        createFolder("saved data\\users");
        createFolder("saved data\\users\\sellers");
        createFolder("saved data\\users\\buyers");
        createFolder("saved data\\users\\admin");
        createFolder("saved data\\products");
        createFolder("saved data\\products\\digital");
        createFolder("saved data\\products\\digital\\mobiles");
        createFolder("saved data\\products\\digital\\mobiles\\productsList");
        createFolder("saved data\\products\\digital\\laptops");
        createFolder("saved data\\products\\digital\\laptops\\productsList");
        createFolder("saved data\\products\\foods");
        createFolder("saved data\\products\\foods\\productsList");
        createFolder("saved data\\products\\homeApplications");
        createFolder("saved data\\products\\homeApplications\\ovens");
        createFolder("saved data\\products\\homeApplications\\ovens\\productsList");
        createFolder("saved data\\products\\homeApplications\\refrigerators");
        createFolder("saved data\\products\\homeApplications\\refrigerators\\productsList");
        createFolder("saved data\\products\\homeApplications\\TVs");
        createFolder("saved data\\products\\homeApplications\\TVs\\productsList");
        createFolder("saved data\\products\\cloth");
        createFolder("saved data\\products\\cloth\\shoes");
        createFolder("saved data\\products\\cloth\\shoes\\productsList");
        createFolder("saved data\\products\\cloth\\shirts");
        createFolder("saved data\\products\\cloth\\shirts\\productsList");
    }

    public static void createFolder(String path){
        File folder = new File(path);
        if (!folder.exists())
            folder.mkdir();
    }
}
