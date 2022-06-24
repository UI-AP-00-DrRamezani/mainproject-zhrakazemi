package com.company.panelsandpages.panels;

import com.company.entity.classes.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CategoryPanel {
    public static ArrayList<CellPhone> cellPhones = new ArrayList<CellPhone>();
    public static ArrayList<Loptop> loptops = new ArrayList<Loptop>();
    public static ArrayList<Shirt> shirt = new ArrayList<Shirt>();
    public static ArrayList<Shoes> shoes = new ArrayList<Shoes>();
    public static ArrayList<TV> tvs = new ArrayList<TV>();
    public static ArrayList<Rifrigirator> rifrigirators = new ArrayList<Rifrigirator>();
    public static ArrayList<Oven> ovens = new ArrayList<Oven>();
    public static ArrayList<Food> foods = new ArrayList<Food>();

    public static void manu() {
        while (true) {
            System.out.println("choose an option:");
            System.out.println("1-viewing whole products\n2-viewing products by searching their name\n");
            Scanner sc = new Scanner(System.in);
            int choose = 0;
            try {
                choose = sc.nextInt();
            } catch (InputMismatchException mismatchException) {
                System.out.println("The input type is incorrect");
            }
            switch (choose) {
                case 1:
                    showProduct();
                    break;
                case 2:
                    searchProducts();
                    break;
            }
        }
    }

    public static void showProduct() {
        ArrayList<Goods> goods = new ArrayList<>();
        System.out.println("choose a category:");
        System.out.println("1-Digital Goods\n2-Clothes\n3-Home Applications\n4-Food products");
        Scanner sc = new Scanner(System.in);
        int category;
        try {
            category = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
        switch (category) {
            case 1:
                System.out.println("please choose :");
                System.out.println("1-Cell Phone\n2-Lop top");
                try {
                    category = sc.nextInt();
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                    return;
                }
                if (category == 1) {
                    int i = 1;
                    for (CellPhone a : cellPhones) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                            " press 0 :");
                    int number;
                    try {
                        number = sc.nextInt();
                    } catch (InputMismatchException mismatchException) {
                        System.out.println("The input type is incorrect");
                        return;
                    }
                    if (number == 0) {
                        for (Goods a : cellPhones) {
                            goods.add(a);
                        }
                        brandFiltering(goods);
                    } else {
                        number = number - 1;
                        ProductPanel.showProduct(cellPhones.get(number));
                    }
                } else if (category == 2) {
                    int i = 1;
                    for (Loptop a : loptops) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                            " press 0 :");
                    int number;
                    try {
                        number = sc.nextInt();
                    } catch (InputMismatchException mismatchException) {
                        System.out.println("The input type is incorrect");
                        return;
                    }
                    if (number == 0) {
                        for (Goods a : loptops) {
                            goods.add(a);
                        }
                        brandFiltering(goods);
                    } else {
                        number = number - 1;
                        ProductPanel.showProduct(loptops.get(number));
                    }
                }

            case 2:
                System.out.println("please choose :");
                System.out.println("1-Shirt\n2-Shoes");
                try {
                    category = sc.nextInt();
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                    return;
                }
                if (category == 1) {
                    int i = 1;
                    for (Shirt a : shirt) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                            " press 0 :");
                    int number;
                    try {
                        number = sc.nextInt();
                    } catch (InputMismatchException mismatchException) {
                        System.out.println("The input type is incorrect");
                        return;
                    }
                    if (number == 0) {
                        for (Goods a : shirt) {
                            goods.add(a);
                        }
                        brandFiltering(goods);
                    } else {
                        number = number - 1;
                        ProductPanel.showProduct(shirt.get(number));
                    }
                } else if (category == 2) {
                    int i = 1;
                    for (Shoes a : shoes) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                            " press 0 :");
                    int number;
                    try {
                        number = sc.nextInt();
                    } catch (InputMismatchException mismatchException) {
                        System.out.println("The input type is incorrect");
                        return;
                    }
                    if (number == 0) {
                        for (Goods a : shoes) {
                            goods.add(a);
                        }
                        brandFiltering(goods);
                    } else {
                        number = number - 1;
                        ProductPanel.showProduct(shoes.get(number));
                    }
                }
            case 3:
                System.out.println("please choose:");
                System.out.println("1-Tvs\n2-Refrigerators\n3-Ovens");
                try {
                    category = sc.nextInt();
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                    return;
                }
                if (category == 1) {
                    int i = 1;
                    for (Goods a : tvs) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                            " press 0 :");
                    int number;
                    try {
                        number = sc.nextInt();
                    } catch (InputMismatchException mismatchException) {
                        System.out.println("The input type is incorrect");
                        return;
                    }
                    if (number == 0) {
                        for (Goods a : tvs) {
                            goods.add(a);
                        }
                        brandFiltering(goods);
                    } else {
                        number = number - 1;
                        ProductPanel.showProduct(tvs.get(number));
                    }
                } else if (category == 2) {
                    int i = 1;
                    for (Rifrigirator a : rifrigirators) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                            " press 0 :");
                    int number;
                    try {
                        number = sc.nextInt();
                    } catch (InputMismatchException mismatchException) {
                        System.out.println("The input type is incorrect");
                        return;
                    }
                    if (number == 0) {
                        for (Goods a : rifrigirators) {
                            goods.add(a);
                        }
                        brandFiltering(goods);
                    } else {
                        number = number - 1;
                        ProductPanel.showProduct(rifrigirators.get(number));
                    }
                } else if (category == 3) {
                    int i = 1;
                    for (Oven a : ovens) {
                        if (a.isConfirmStatus() == true) {
                            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                            i++;
                        }
                    }
                    System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                            " press 0 :");
                    int number;
                    try {
                        number = sc.nextInt();
                    } catch (InputMismatchException mismatchException) {
                        System.out.println("The input type is incorrect");
                        return;
                    }
                    if (number == 0) {
                        for (Goods a : ovens) {
                            goods.add(a);
                        }
                        brandFiltering(goods);
                    } else {
                        number = number - 1;
                        ProductPanel.showProduct(ovens.get(number));
                    }
                }
            case 4:
                int i = 1;
                for (Food a : foods) {
                    if (a.isConfirmStatus() == true) {
                        System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
                        i++;
                    }
                }
                System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                        " press 0 :");
                int number;
                try {
                    number = sc.nextInt();
                } catch (InputMismatchException mismatchException) {
                    System.out.println("The input type is incorrect");
                    return;
                }
                if (number == 0) {
                    for (Goods a : foods) {
                        goods.add(a);
                    }
                    brandFiltering(goods);
                } else {
                    number = number - 1;
                    ProductPanel.showProduct(foods.get(number));
                }
        }
    }

    public static void searchProducts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name of product for search: ");
        String name = sc.nextLine();
        showSearchResault(Admin.realGoods, name);
    }

    public static void showSearchResault(ArrayList<Goods> goods, String name) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Goods> resultGoods = new ArrayList<>();
        for (Goods c : goods) {
            if (c.isConfirmStatus() == true) {
                if (c.getName().equals(name)) {
                    resultGoods.add(c);
                }
            }
        }
        if (resultGoods.size() == 0) {
            System.out.println("didnt found");
        }
        int i = 1;
        for (Goods a : resultGoods) {
            System.out.println(i + ".  " + a.getName() + "  " + a.getBrand() + "   " + a.getPrice());
            i++;
        }
        System.out.println("for viewing each product enter the number next to it and for filtering them by brand ," +
                " press 0 :");
        int order;
        try {
            order = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
        if (order > 0) {
            order = order - 1;
            ProductPanel.showProduct(resultGoods.get(order));
        } else if (order == 0) {
            brandFiltering(resultGoods);
        }
    }

    public static void brandFiltering(ArrayList<Goods> goods) {
        ArrayList<Goods> resultGoods = new ArrayList<>();
        System.out.println("enter a Brand name");
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        for (Goods a : goods) {
            if (a.isConfirmStatus() == true) {
                if (a.getBrand().equals(brand)) {
                    resultGoods.add(a);
                }
            }
        }
        int i = 1;
        for (Goods a : resultGoods) {
            System.out.println(i + ".  " + a.getName() + "  " + a.isExist() + "   " + a.getPrice());
            i++;
        }
        System.out.println("for viewing each product enter the number next to it: ");
        int number;
        try {
            number = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("The input type is incorrect");
            return;
        }
        number = number - 1;
        ProductPanel.showProduct(resultGoods.get(number));
    }
}
