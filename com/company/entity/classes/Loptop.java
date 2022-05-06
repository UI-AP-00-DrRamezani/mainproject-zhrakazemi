package com.company.entity.classes;

public class Loptop extends DigitalGood {
    private String CPUModel;
    private boolean gaming;

    public Loptop(String goodId, String name, String brand, long price, boolean exist, String information,
                  String sellerCompanyName, String sellerName, int memory, int ram,
                  String system, double mass, double size, String CPUModel, boolean gaming) {
        super(goodId, name, brand, price, exist, information, sellerCompanyName, sellerName, memory, ram, system, mass, size);
        setCPUModel(CPUModel);
        setGaming(gaming);
    }

    @Override
    public String toString() {
        return (getGoodId() + "    " + getName() + "    " + getBrand() + "\n" + getPrice() + "   " + getSellerCompanyName() + " , "
                + getSellerName() + "\n" + getInformation() + "\n" + getAverageScore() + "\n" + isExist() + "\nmemory: " + getMemory() +
                "\nram : " + getRam() + "\nsystem: " + getSystem() + "\nmass: " + getMass() + "\nsize: " + getSize() + "\nCPU model: " + getCPUModel() +
                "\ngaming status: " + isGaming());
    }

    public String getCPUModel() {
        return CPUModel;
    }

    public void setCPUModel(String CPUModel) {
        this.CPUModel = CPUModel;
    }

    public boolean isGaming() {
        return gaming;
    }

    public void setGaming(boolean gaming) {
        this.gaming = gaming;
    }
}
