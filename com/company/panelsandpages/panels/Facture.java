package com.company.panelsandpages.panels;

import com.company.entity.classes.Goods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Facture {
    final private String factureCod;
    final private String factureDate;
    final private long facturePrice;
    final public static ArrayList<Goods> factureGoods = new ArrayList<Goods>();
    final private String factureSellerName;
    private String factureSendStatus;

    public String getFactureCod() {
        return factureCod;
    }

    public String getFactureDate() {
        return factureDate;
    }

    public long getFacturePrice() {
        return facturePrice;
    }

    public String getFactureSellerName() {
        return factureSellerName;
    }

    public String getFactureSendStatus() {
        return factureSendStatus;
    }

    public void setFactureSendStatus(String factureSendStatus) {
        this.factureSendStatus = factureSendStatus;
    }

    public Facture(String factureCod, long facturePrice, String factureSellerName, String factureSendStatus) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.factureCod = factureCod;
        this.factureDate = dtf.format(now);
        this.facturePrice = facturePrice;
        this.factureSellerName = factureSellerName;
        this.factureSendStatus = factureSendStatus;
    }
}
