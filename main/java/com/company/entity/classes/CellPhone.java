package com.company.entity.classes;

public class CellPhone extends DigitalGood implements Comparable {
    private int simCard;
    private int cameraQuality;

    public CellPhone(String goodId, String name, String brand, long price, boolean exist, String information,
                     String sellerCompanyName, String sellerName, int memory, int ram,
                     String system, double mass, double size, int simCard, int cameraQuality) {
        super(goodId, name, brand, price, exist, information, sellerCompanyName, sellerName, memory, ram, system, mass, size);
        setSimCard(simCard);
        setCameraQuality(cameraQuality);
    }

    @Override
    public String toString() {
        return (getGoodId() + "    " + getName() + "    " + getBrand() + "\n" + getPrice() + "   " + getSellerCompanyName() + " , "
                + getSellerName() + "\n" + getInformation() + "\n" + getAverageScore() + "\n" + isExist() + "\nmemory: " + getMemory() +
                "\nram : " + getRam() + "\nsystem: " + getSystem() + "\nmass: " + getMass() + "\nsize: " + getSize() +
                "\nnumber of simcards: " + getSimCard() + "\ncamera Quality: " + getCameraQuality());
    }

    public int getSimCard() {
        return simCard;
    }

    public void setSimCard(int simCard) {
        this.simCard = simCard;
    }

    public int getCameraQuality() {
        return cameraQuality;
    }

    public void setCameraQuality(int cameraQuality) {
        this.cameraQuality = cameraQuality;
    }

    public int compareTo(Object o) {
        if (o instanceof Loptop) {
            return -1;
        } else if (o instanceof CellPhone) {
            if (this.getName().compareTo(((CellPhone) o).getName()) > 0)
                return 1;
            else if (this.getName().compareTo(((CellPhone) o).getName()) < 0)
                return -1;
            else {
                if (this.getCameraQuality() > ((CellPhone) o).getCameraQuality())
                    return 1;
                else if (this.getCameraQuality() < ((CellPhone) o).getCameraQuality())
                    return -1;
                else {
                    if (this.getAverageScore() > ((CellPhone) o).getAverageScore())
                        return 1;
                    else if (this.getAverageScore() < ((CellPhone) o).getAverageScore())
                        return -1;
                    else {
                        if (this.getPrice() > ((CellPhone) o).getPrice())
                            return 1;
                        else if (this.getPrice() < ((CellPhone) o).getPrice())
                            return -1;
                        else {
                            if (this.isExist() && ((CellPhone) o).isExist())
                                return 1;
                            else if (!this.isExist() && ((CellPhone) o).isExist())
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
