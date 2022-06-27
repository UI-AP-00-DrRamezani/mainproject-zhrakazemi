package com.company;

import com.company.entity.classes.Buyer;
import com.company.entity.classes.Goods;
import com.company.panels.FactureCommander;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import static com.company.MainMenu.OnlineShopPanel.buyers;

public class ViewCart {

    @FXML
    private Button btnShopping;

    @FXML
    private ListView<String> lvProducts;

    @FXML
    void pressonBtnSHOPPING(ActionEvent event) {
        FactureCommander.shopping(HelloApplication.buyer);
        initialize();

    }

    public void initialize(){
        final ObservableList<String> observableList = FXCollections.observableArrayList();
        for (Goods a: HelloApplication.buyer.cart) {
            int i = 1;
            observableList.add(i + ". " + a.getName() + "   " + a.getName() + " " + a.getBrand() + "   " + a.getPrice());
            i++;
        }
        lvProducts.setItems(observableList);
    }
}
