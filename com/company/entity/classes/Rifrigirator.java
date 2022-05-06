package com.company.entity.classes;

public class Rifrigirator extends HomeApplication {
    private int capacity;
    private String Type;
    private boolean freezer;

    public Rifrigirator(String goodId, String name, String brand, long price, boolean exist, String information,
                        String sellerCompanyName, String sellerName, String energyUsage,
                        boolean warranty, int capacity, String type, boolean freezer) {
        super(goodId, name, brand, price, exist, information, sellerCompanyName, sellerName, energyUsage, warranty);
        setCapacity(capacity);
        setType(type);
        setFreezer(freezer);
    }

    @Override
    public String toString() {
        return (getGoodId() + "    " + getName() + "    " + getBrand() + "\n" + getPrice() + "   " + getSellerCompanyName() + " , "
                + getSellerName() + "\n" + getInformation() + "\n" + getAverageScore() + "\n" + isExist() + "\nEnergy usage: " + getEnergyUsage() + "\nwarranty status: " + isWarranty() +
                "\ncapacity: " + getCapacity() + "\ntype: " + getType() + "\nfreezer status: " + isFreezer());
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
