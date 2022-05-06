package com.company.entity.classes;

public class TV extends HomeApplication {
    private int pictureQuality;
    private int size;

    public TV(String goodId, String name, String brand, long price, boolean exist, String information
            , String sellerCompanyName, String sellerName,
              String energyUsage, boolean warranty, int pictureQuality, int size) {
        super(goodId, name, brand, price, exist, information, sellerCompanyName, sellerName, energyUsage, warranty);
        setPictureQuality(pictureQuality);
        setSize(size);
    }

    @Override
    public String toString() {
        return (getGoodId() + "    " + getName() + "    " + getBrand() + "\n" + getPrice() + "   " + getSellerCompanyName() + " , "
                + getSellerName() + "\n" + getInformation() + "\n" + getAverageScore() + "\n" + isExist() +
                "Energy usage: " + getEnergyUsage() + "\nwarranty status :" + isWarranty() + "\npicture quality: "
                + getPictureQuality() + "\nsize: " + getSize());
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
