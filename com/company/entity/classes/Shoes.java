package com.company.entity.classes;

public class Shoes extends Clothes {
    private int size;

    public static enum shoeType {
        boot, sport, highHeel
    }

    shoeType type;

    public Shoes(String goodId, String name, String brand, long price, boolean exist, String information,
                 String sellerCompanyName, String sellerName, String country, String material, int size, shoeType type) {
        super(goodId, name, brand, price, exist, information, sellerCompanyName, sellerName, country, material);
        setSize(size);
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
