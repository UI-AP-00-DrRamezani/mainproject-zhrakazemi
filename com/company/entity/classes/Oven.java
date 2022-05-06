package com.company.entity.classes;

public class Oven extends HomeApplication {
    private int ovenNumber;
    private String material;
    private boolean oven;

    public Oven(String goodId, String name, String brand, long price, boolean exist, String information,
                String sellerCompanyName, String sellerName, String energyUsage,
                boolean warranty, int ovenNumber, String material, boolean oven) {
        super(goodId, name, brand, price, exist, information, sellerCompanyName, sellerName, energyUsage, warranty);
        setOvenNumber(ovenNumber);
        setMaterial(material);
        setOven(oven);
    }

    @Override
    public String toString() {
        return (getGoodId() + "    " + getName() + "    " + getBrand() + "\n" + getPrice() + "   " + getSellerCompanyName() + " , "
                + getSellerName() + "\n" + getInformation() + "\n" + getAverageScore() + "\n" + isExist() + "\nEnergy usage: " + getEnergyUsage() + "\nwarranty status: " + isWarranty() +
                "\noven number: " + getOvenNumber() + "\nmaterial: " + getMaterial() + "\nOven status : " + isOven());
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
