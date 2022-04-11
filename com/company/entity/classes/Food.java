package com.company.entity.classes;

public class Food extends Goods {
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
}
