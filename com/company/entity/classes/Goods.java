
package com.company.entity.classes;
import com.company.entity.classes.GeneralAccount;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Goods {
    private String goodId;
    private String name;
    private String brand;
    private long price;
    private boolean exist;
    private String information;
    private double averageScore;
    private String sellerCompanyName;
    private String sellerName;
    //TODO
    //liste nazarat


    public Goods(String goodId, String name, String brand, long price, boolean exist, String information, double averageScore, String sellerCompanyName, String sellerName) {
        this.goodId = goodId;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.exist = exist;
        this.information = information;
        this.averageScore = averageScore;
       setSellerCompanyName(sellerCompanyName);
        setSellerName(sellerName);
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getGoodId() {
        return goodId;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public long getPrice() {
        return price;
    }


    public boolean isExist() {
        return exist;
    }

    public String getInformation() {
        return information;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public String getSellerCompanyName() {
        return sellerCompanyName;
    }

    public void setSellerCompanyName(String sellerCompanyName) {
        this.sellerCompanyName = sellerCompanyName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
}

abstract class DigitalGood extends Goods {
    private int memory;
    private int ram;
    private String system;
    private double mass;
    private double size;

    public DigitalGood(String goodId, String name, String brand, long price, boolean exist, String information,
                       double averageScore, String sellerCompanyName, String sellerName, int memory, int ram,
                       String system, double mass, double size) {
        super(goodId, name, brand, price, exist, information, averageScore, sellerCompanyName, sellerName);
        this.memory = memory;
        this.ram = ram;
        this.system = system;
        this.mass = mass;
        this.size = size;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}

class CellPhone extends DigitalGood {
    private int simCard;
    private int cameraQuality;

    public CellPhone(String goodId, String name, String brand, long price, boolean exist, String information,
                     double averageScore, String sellerCompanyName, String sellerName, int memory, int ram,
                     String system, double mass, double size, int simCard, int cameraQuality) {
        super(goodId, name, brand, price, exist, information, averageScore, sellerCompanyName, sellerName, memory, ram, system, mass, size);
        this.simCard = simCard;
        this.cameraQuality = cameraQuality;
    }

    public int getSimCard() {
        return simCard;
    }

    public void setSimCard(int simCard) {
        this.simCard = simCard;
    }

    public int getCameraQuality() {
        return cameraQuality;
    }

    public void setCameraQuality(int cameraQuality) {
        this.cameraQuality = cameraQuality;
    }
}

class Loptop extends DigitalGood {
    private String CPUModel;
    private boolean gaming;

    public Loptop(String goodId, String name, String brand, long price, boolean exist, String information,
                  double averageScore, String sellerCompanyName, String sellerName, int memory, int ram,
                  String system, double mass, double size, String CPUModel, boolean gaming) {
        super(goodId, name, brand, price, exist, information, averageScore, sellerCompanyName, sellerName, memory, ram, system, mass, size);
        this.CPUModel = CPUModel;
        this.gaming = gaming;
    }

    public String getCPUModel() {
        return CPUModel;
    }

    public void setCPUModel(String CPUModel) {
        this.CPUModel = CPUModel;
    }

    public boolean isGaming() {
        return gaming;
    }

    public void setGaming(boolean gaming) {
        this.gaming = gaming;
    }
}

abstract class Clothes extends Goods {
    private String country;
    private String material;

    public Clothes(String goodId, String name, String brand, long price, boolean exist, String information,
                   double averageScore, String sellerCompanyName, String sellerName, String country, String material) {
        super(goodId, name, brand, price, exist, information, averageScore, sellerCompanyName, sellerName);
        this.country = country;
        this.material = material;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

class Shirt extends Clothes {
    private String size;

    enum clothType {
        Tshirt, pants, dress, underWear, jacket
    }

    clothType type;

    public Shirt(String goodId, String name, String brand, long price, boolean exist, String information,
                 double averageScore, String sellerCompanyName, String sellerName, String country, String material, String size, clothType type) {
        super(goodId, name, brand, price, exist, information, averageScore, sellerCompanyName, sellerName, country, material);
        this.size = size;
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

class Shoes extends Clothes {
    private int size;

    enum shoeType {
        boot, sport, highHeel
    }

    shoeType type;

    public Shoes(String goodId, String name, String brand, long price, boolean exist, String information,
                 double averageScore, String sellerCompanyName, String sellerName, String country, String material, int size, shoeType type) {
        super(goodId, name, brand, price, exist, information, averageScore, sellerCompanyName, sellerName, country, material);
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

abstract class HomeApplication extends Goods {
    private String energyUsage;
    private boolean warranty;

    public HomeApplication(String goodId, String name, String brand, long price, boolean exist, String information,
                           double averageScore, String sellerCompanyName, String sellerName, String energyUsage, boolean warranty) {
        super(goodId, name, brand, price, exist, information, averageScore, sellerCompanyName, sellerName);
        this.energyUsage = energyUsage;
        this.warranty = warranty;
    }

    public String getEnergyUsage() {
        return energyUsage;
    }

    public void setEnergyUsage(String energyUsage) {
        this.energyUsage = energyUsage;
    }

    public boolean isWarranty() {
        return warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }
}

class TV extends HomeApplication {
    private int pictureQuality;
    private int size;

    public TV(String goodId, String name, String brand, long price, boolean exist, String information,
              double averageScore, String sellerCompanyName, String sellerName,
              String energyUsage, boolean warranty, int pictureQuality, int size) {
        super(goodId, name, brand, price, exist, information, averageScore, sellerCompanyName, sellerName, energyUsage, warranty);
        this.pictureQuality = pictureQuality;
        this.size = size;
    }

    public int getPictureQuality() {
        return pictureQuality;
    }

    public void setPictureQuality(int pictureQuality) {
        this.pictureQuality = pictureQuality;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Rifrigirator extends HomeApplication {
    private int capacity;
    private String Type;
    private boolean freezer;

    public Rifrigirator(String goodId, String name, String brand, long price, boolean exist, String information,
                        double averageScore, String sellerCompanyName, String sellerName, String energyUsage,
                        boolean warranty, int capacity, String type, boolean freezer) {
        super(goodId, name, brand, price, exist, information, averageScore, sellerCompanyName, sellerName, energyUsage, warranty);
        this.capacity = capacity;
        Type = type;
        this.freezer = freezer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public boolean isFreezer() {
        return freezer;
    }

    public void setFreezer(boolean freezer) {
        this.freezer = freezer;
    }
}

class Oven extends HomeApplication {
    private int ovenNumber;
    private String material;
    private boolean oven;

    public Oven(String goodId, String name, String brand, long price, boolean exist, String information,
                double averageScore, String sellerCompanyName, String sellerName, String energyUsage,
                boolean warranty, int ovenNumber, String material, boolean oven) {
        super(goodId, name, brand, price, exist, information, averageScore, sellerCompanyName, sellerName, energyUsage, warranty);
        this.ovenNumber = ovenNumber;
        this.material = material;
        this.oven = oven;
    }

    public int getOvenNumber() {
        return ovenNumber;
    }

    public void setOvenNumber(int ovenNumber) {
        this.ovenNumber = ovenNumber;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isOven() {
        return oven;
    }

    public void setOven(boolean oven) {
        this.oven = oven;
    }
}

class Food extends Goods {
    private String productionDate;
    private String expiryDate;

    public Food(String goodId, String name, String brand, long price, boolean exist, String information,
                double averageScore, String sellerCompanyName, String sellerName, String productionDate, String expiryDate) {
        super(goodId, name, brand, price, exist, information, averageScore, sellerCompanyName, sellerName);
        this.productionDate = productionDate;
        this.expiryDate = expiryDate;
    }

    public String getProductioDate() {
        return productionDate;
    }

    public void setProductionDate(String productioDate) {
        this.productionDate = productioDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}

