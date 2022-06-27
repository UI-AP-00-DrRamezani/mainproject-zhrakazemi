package com.company;

import com.company.entity.classes.Buyer;
import com.company.entity.classes.Goods;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;


public class Facture {

    @FXML
    private ListView<String> listviewFacture;


    public void initialize(){
        final ObservableList<String> observableList = FXCollections.observableArrayList();
        int i = 1;
        for (Goods a : HelloApplication.salePerson.saledGoods) {
            observableList.add(i + " ." + a.getName() + "   " + a.getBrand() + "   " + a.getPrice() + "    " + a.getSellerCompanyName() + "   " + a.getSellerName());
        }
        listviewFacture.setItems(observableList);
    }
}