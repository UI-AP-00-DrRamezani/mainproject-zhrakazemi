package com.company;

import com.company.MainMenu.OnlineShopPanel;
import com.company.entity.classes.Admin;
import com.company.entity.classes.Buyer;
import com.company.entity.classes.SalePerson;

import java.sql.*;

public class Databese {
    public static void loadData() {
        String sql = "select account.username , account.name ,account.lastname ,account.password ,account.phinenumber,account.seller,email.email FROM account INNER JOIN email ON account.username=email.username";
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/shop", "root", "");
            Statement s = con.prepareStatement(sql);
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                if (r.getString("seller").equals("0"))
                    OnlineShopPanel.buyers.add(new Buyer(r.getString("username"), r.getString("name"), r.getString("lastname"), r.getString("email"), Long.parseLong(r.getString("phinenumber")), r.getString("password"),10000));
                else
                    Admin.reallSellers.add(new SalePerson(r.getString("username"), r.getString("name"), r.getString("lastname"), r.getString("email"), Integer.parseInt(r.getString("phinenumber")), r.getString("password"), "", ""));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
