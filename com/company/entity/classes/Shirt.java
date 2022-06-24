package com.company.entity.classes;

public class Shirt extends Clothes implements Comparable{
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

    @Override
    public int compareTo(Object o) {
        if(o instanceof  Loptop ||
                o instanceof  CellPhone ||
                o instanceof  Rifrigirator ||
                o instanceof TV||
        o instanceof Oven){
            return -1;
        }
        else if(o instanceof Shirt){
            if (this.getName().compareTo(((Shirt) o).getName()) > 0)
                return 1;
            else if (this.getName().compareTo(((Shirt) o).getName()) < 0)
                return -1;
            else {
                if (this.getSize().compareTo(((Shirt) o).getSize()) >0 )
                    return 1;
                else if (this.getSize().compareTo(((Shirt) o).getSize())< 0)
                    return -1;
                else {
                    if (this.getAverageScore() > ((Shirt) o).getAverageScore())
                        return 1;
                    else if (this.getAverageScore() < ((Shirt) o).getAverageScore())
                        return -1;
                    else {
                        if (this.getPrice() > ((Shirt) o).getPrice())
                            return 1;
                        else if (this.getPrice() < ((Shirt) o).getPrice())
                            return -1;
                        else {
                            if (this.isExist() && ((Shirt) o).isExist())
                                return 1;
                            else if (!this.isExist() && ((Shirt) o).isExist())
                                return -1;
                        }
                    }
                }
            }
        }
        else {
            return 1;
        }
        return 0;
    }
}
