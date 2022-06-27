package com.company;

import com.company.MainMenu.OnlineShopPanel;
import com.company.entity.classes.Buyer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.company.MainMenu.OnlineShopPanel.buyers;

public class UserList {

    @FXML
    private ListView<String> listviewUsers;

    @FXML
    void pressonUser(MouseEvent event) {
        OnlineShopPanel.buyers.remove(listviewUsers.getSelectionModel().getSelectedIndex());
        String sql = String.format("DELETE FROM account WHERE username='%s'",OnlineShopPanel.buyers.get(listviewUsers.getSelectionModel().getSelectedIndex()).getUserName());
        String sql2 = String.format("DELETE FROM email WHERE username='%s'",OnlineShopPanel.buyers.get(listviewUsers.getSelectionModel().getSelectedIndex()).getUserName());
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/shop", "root", "");
            Statement s = con.prepareStatement(sql);
            s.execute(sql);
            Statement s2 = con.prepareStatement(sql2);
            s2.execute(sql2);
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        initialize();
    }
    public void initialize(){
        final ObservableList<String> observableList = FXCollections.observableArrayList();
        for (Buyer a : buyers) {
            int i = 1;
            observableList.add(i + ". " + a.getUserName() + "   " + a.getName() + " " + a.getLastName() + "   " + a.getEmail() + "   " + a.getPhoneNumber());
            i++;
        }
        listviewUsers.setItems(observableList);
    }
}
