package com.company.entity.classes;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Goods implements Serializable {
    private String goodId;
    private String name;
    private String brand;
    private long price;
    private boolean exist;
    private String information;
    private double averageScore;
    private String sellerCompanyName;
    private String sellerName;
    private boolean confirmStatus = false;
    public ArrayList<Double> clientsScore = new ArrayList<Double>();
    public ArrayList<UserReview> clientsView = new ArrayList<UserReview>();
    public ArrayList<Discount> discounts = new ArrayList<>();

    public ArrayList<Discount> getDiscounts() {
        return discounts;
    }

    public Goods(String goodId, String name, String brand, long price, boolean exist, String information, String sellerCompanyName, String sellerName) {
        setGoodId(goodId);
        setName(name);
        setBrand(brand);
        setPrice(price);
        setExist(exist);
        setInformation(information);
        setAverageScore(averageScore);
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

    public boolean isConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(boolean confirmStatus) {
        this.confirmStatus = confirmStatus;
    }
}

abstract class DigitalGood extends Goods implements Comparable , DiscountOption{
    private int memory;
    private int ram;
    private String system;
    private double mass;
    private double size;

    public DigitalGood(String goodId, String name, String brand, long price, boolean exist, String information,
                       String sellerCompanyName, String sellerName, int memory, int ram,
                       String system, double mass, double size) {
        super(goodId, name, brand, price, exist, information, sellerCompanyName, sellerName);
        setMemory(memory);
        setRam(ram);
        setSystem(system);
        setMass(mass);
        setSize(size);
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

    @Override
    public int compareTo(Object o) {
            if(o instanceof CellPhone){
                return -1;
            }
            else if(o instanceof  Loptop){
                return 1;}
            else{
                return -1;
                }
            }
    @Override
    public void addDiscount(int capacity, String validityDuration) {
        this.getDiscounts().add(new Discount(capacity, 30, validityDuration, false));
    }

    @Override
    public void allTimeDiscount(int capacity, String validityDuration) {
        this.getDiscounts().add(new Discount(capacity, 30, validityDuration, true));
    }

    @Override
    public void makeDiscountCode(Discount discount) {
        if (discount.getCode() == null)
            discount.setCode("digital" + (int) (1000 + (Math.random() * 9999)));
    }
        }

abstract class Clothes extends Goods implements DiscountOption{
    private String country;
    private String material;

    public Clothes(String goodId, String name, String brand, long price, boolean exist, String information,
                   String sellerCompanyName, String sellerName, String country, String material) {
        super(goodId, name, brand, price, exist, information, sellerCompanyName, sellerName);
        setCountry(country);
        setMaterial(material);
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
    @Override
    public void addDiscount(int capacity, String validityDuration) {
        this.getDiscounts().add(new Discount(capacity, 30, validityDuration, false));
    }

    @Override
    public void allTimeDiscount(int capacity, String validityDuration) {
        this.getDiscounts().add(new Discount(capacity, 30, validityDuration, true));
    }

    @Override
    public void makeDiscountCode(Discount discount) {
        if (discount.getCode() == null)
            discount.setCode("cloth" + (int) (1000 + (Math.random() * 9999)));
    }

}

abstract class HomeApplication extends Goods implements DiscountOption{
    private String energyUsage;
    private boolean warranty;

    public HomeApplication(String goodId, String name, String brand, long price, boolean exist, String information,
                           String sellerCompanyName, String sellerName, String energyUsage, boolean warranty) {
        super(goodId, name, brand, price, exist, information, sellerCompanyName, sellerName);
        setEnergyUsage(energyUsage);
        setWarranty(warranty);
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
    @Override
    public void addDiscount(int capacity, String validityDuration) {
        this.getDiscounts().add(new Discount(capacity, 30, validityDuration, false));
    }

    @Override
    public void allTimeDiscount(int capacity, String validityDuration) {
        this.getDiscounts().add(new Discount(capacity, 30, validityDuration, true));
    }

    @Override
    public void makeDiscountCode(Discount discount) {
        if (discount.getCode() == null)
            discount.setCode("hom" + (int) (1000 + (Math.random() * 9999)));
    }
}

