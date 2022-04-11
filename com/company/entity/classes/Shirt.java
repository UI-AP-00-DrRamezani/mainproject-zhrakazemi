package com.company.entity.classes;

public class Shirt extends Clothes {
    private String size;

    public static enum clothType {
        Tshirt, pants, dress, underWear, jacket
    }

    clothType type;

    public Shirt(String goodId, String name, String brand, long price, boolean exist, String information,
                 String sellerCompanyName, String sellerName, String country, String material, String size, clothType type) {
        super(goodId, name, brand, price, exist, information, sellerCompanyName, sellerName, country, material);
        setSize(size);
        this.type = type;
    }

    @Override
    public String toString() {
        return (getGoodId() + "    " + getName() + "    " + getBrand() + "\n" + getPrice() + "   " + getSellerCompanyName() + " , "
                + getSellerName() + "\n" + getInformation() + "\n" + getAverageScore() + "\n" + isExist() + "made in: " + getCountry() + "\nsize : " + getSize() + "type: " + this.type);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
