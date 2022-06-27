package com.company;

import com.company.entity.classes.Buyer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import static com.company.MainMenu.OnlineShopPanel.buyers;

public class UserList {

    @FXML
    private ListView<String> listviewUsers;

    @FXML
    void pressonUser(MouseEvent event) {

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
