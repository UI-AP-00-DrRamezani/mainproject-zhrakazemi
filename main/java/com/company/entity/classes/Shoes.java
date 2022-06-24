package com.company.entity.classes;

public class Shoes extends Clothes implements Comparable{
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

    @Override
    public int compareTo(Object o) {
        if (o instanceof Loptop ||
                o instanceof CellPhone ||
                o instanceof Rifrigirator ||
                o instanceof TV ||
                o instanceof Shirt) {
            return -1;
        } else if (o instanceof Shoes) {
            if (this.getName().compareTo(((Shoes) o).getName()) > 0)
                return 1;
            else if (this.getName().compareTo(((Shoes) o).getName()) < 0)
                return -1;
            else {
                if (this.getSize() > ((Shoes) o).getSize())
                    return 1;
                else if (this.getSize() < ((Shoes) o).getSize())
                    return -1;
                else {
                    if (this.getAverageScore() > ((Shoes) o).getAverageScore())
                        return 1;
                    else if (this.getAverageScore() < ((Shoes) o).getAverageScore())
                        return -1;
                    else {
                        if (this.getPrice() > ((Shoes) o).getPrice())
                            return 1;
                        else if (this.getPrice() < ((Shoes) o).getPrice())
                            return -1;
                        else {
                            if (this.isExist() && ((Shoes) o).isExist())
                                return 1;
                            else if (!this.isExist() && ((Shoes) o).isExist())
                                return -1;
                        }
                    }
                }
            }
        }else{
            return 1;
        }
        return 0;}
    }

