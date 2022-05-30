package com.company.entity.classes;

public class Food extends Goods implements Comparable {
    private String productionDate;
    private String expiryDate;

    public Food(String goodId, String name, String brand, long price, boolean exist, String information
            , String sellerCompanyName, String sellerName, String productionDate, String expiryDate) {
        super(goodId, name, brand, price, exist, information, sellerCompanyName, sellerName);
        setProductionDate(productionDate);
        setExpiryDate(expiryDate);
    }

    @Override
    public String toString() {
        return (getGoodId() + "    " + getName() + "    " + getBrand() + "\n" + getPrice() + "   " + getSellerCompanyName() + " , "
                + getSellerName() + "\n" + getInformation() + "\n" + getAverageScore() +
                "production date: " + getProductioDate() + "\nexpiry date :" + getExpiryDate());
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

    @Override
    public int compareTo(Object o) {
        if(o instanceof Loptop ||
                o instanceof CellPhone ||
                o instanceof Rifrigirator ||
                o instanceof TV ||
                o instanceof Shirt||
                o instanceof Shoes) {
            return -1;
        }else if( o instanceof  Food){
            if (this.getName().compareTo(((Food) o).getName()) > 0)
                return 1;
            else if (this.getName().compareTo(((Food) o).getName()) < 0)
                return -1;
            else {
                if (this.getExpiryDate().compareTo(((Food) o).getExpiryDate())> 0)
                    return 1;
                else if (this.getExpiryDate().compareTo(((Food) o).getExpiryDate())> 0)
                    return -1;
                else {
                    if (this.getAverageScore() > ((Food) o).getAverageScore())
                        return 1;
                    else if (this.getAverageScore() < ((Food) o).getAverageScore())
                        return -1;
                    else {
                        if (this.getPrice() > ((Food) o).getPrice())
                            return 1;
                        else if (this.getPrice() < ((Food) o).getPrice())
                            return -1;
                        else {
                            if (this.isExist() && ((Food) o).isExist())
                                return 1;
                            else if (!this.isExist() && ((Food) o).isExist())
                                return -1;
                        }
                    }
                }
            }
        }else{
            return 1;
        }
        return 0;
    }
}
