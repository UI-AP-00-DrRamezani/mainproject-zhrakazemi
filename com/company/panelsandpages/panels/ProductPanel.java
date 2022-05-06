package com.company.panelsandpages.panels;

import com.company.Main;
import com.company.MainMenu.OnlineShopPanel;
import com.company.entity.classes.Goods;
import com.company.entity.classes.UserReview;

import java.util.Scanner;

public class ProductPanel {
    public static void showProduct(Goods goods) {
        while (true) {
            System.out.println("------------------------");
            System.out.println(goods.toString());
            for (UserReview a : goods.clientsView) {
                System.out.println(a);
            }
            System.out.println("------------------------");
            System.out.println("press:\n1-add this product to your cart\n2-write a review on this product\n3-give an score to this product\n4-to view your cart\n5-turn back");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    if (Main.buyer != null) {
                        Main.buyer.cart.add(goods);
                    } else {
                        System.out.println("sorry , you must have login first: ");
                        OnlineShopPanel.buyerlogin();
                    }
                    break;
                case 2:
                    if (Main.buyer != null) {
                        UserReviewpanel.getInof(Main.buyer, goods);
                    } else {
                        System.out.println("sorry , you must log in first");
                        OnlineShopPanel.buyerlogin();
                    }
                    break;
                case 3:
                    if (Main.buyer != null) {
                        UserScorePanel.getScore(goods);
                    } else {
                        System.out.println("sorry , you must log in first");
                        OnlineShopPanel.buyerlogin();
                    }
                    break;
                case 4:
                    if (Main.buyer != null) {
                        BuyerPanel.cart(Main.buyer);
                    } else {
                        System.out.println("sorry , you must log in first");
                        OnlineShopPanel.buyerlogin();
                    }
                    break;
                case 5:
                    return;
            }
        }
    }
}
