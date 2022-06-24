package com.company.panels;

import com.company.Exceptions.LackOfBudgetException;
import com.company.entity.classes.Admin;
import com.company.entity.classes.Buyer;
import com.company.entity.classes.Goods;
import com.company.entity.classes.SalePerson;

public class FactureCommander {
    public static void shopping(Buyer buyer)  {
        for (Goods a : buyer.cart) {
            if (buyer.getMoney() < a.getPrice()) {
                throw new LackOfBudgetException("you dont have enough money on your account");
            } else {
                buyer.setMoney(buyer.getMoney() - a.getPrice());
                Facture.factureGoods.add(a);
                buyer.boughtGoods.add(a);
                for (SalePerson x : Admin.reallSellers) {
                    if (x.getName().equals(a.getName())) {
                        x.saledGoods.add(a);
                    }
                }
            }
        }
        BuyerPanel.printFacture(Facture.factureGoods);
    }
}
