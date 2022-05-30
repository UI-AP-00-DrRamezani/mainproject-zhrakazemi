package com.company.entity.classes;

public class TV extends HomeApplication implements Comparable {
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

    @Override
    public int compareTo(Object o) {
        if (o instanceof Loptop ||
                o instanceof CellPhone ||
                o instanceof Rifrigirator) {
            return -1;
        } else if (o instanceof TV) {
            if (this.getName().compareTo(((TV) o).getName()) > 0)
                return 1;
            else if (this.getName().compareTo(((TV) o).getName()) < 0)
                return -1;
            else {
                if (this.getPictureQuality() > ((TV) o).getPictureQuality())
                    return 1;
                else if (this.getPictureQuality() < ((TV) o).getPictureQuality())
                    return -1;
                else {
                    if (this.getAverageScore() > ((TV) o).getAverageScore())
                        return 1;
                    else if (this.getAverageScore() < ((TV) o).getAverageScore())
                        return -1;
                    else {
                        if (this.getPrice() > ((TV) o).getPrice())
                            return 1;
                        else if (this.getPrice() < ((TV) o).getPrice())
                            return -1;
                        else {
                            if (this.isExist() && ((TV) o).isExist())
                                return 1;
                            else if (!this.isExist() && ((TV) o).isExist())
                                return -1;
                        }
                    }
                }
            }
        } else {
            return 1;
        }
        return 0;
    }
}
