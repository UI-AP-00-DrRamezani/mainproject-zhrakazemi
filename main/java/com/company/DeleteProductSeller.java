package com.company;

import com.company.entity.classes.Goods;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class DeleteProductSeller {

    @FXML
    private ListView<String> productListview;

    @FXML
    void pressonProduct(MouseEvent event) {
        HelloApplication.salePerson.deleteRequests.add(HelloApplication.salePerson.goods.get(productListview.getSelectionModel().getSelectedIndex()));

    }
    public void initialize() {
        final ObservableList<String> observableList = FXCollections.observableArrayList();
        int i = 1;
        for (Goods a : HelloApplication.salePerson.saledGoods) {
            observableList.add(i + " ." + a.getName() + "   " + a.getBrand() + "   " + a.getPrice());
        }
        productListview.setItems(observableList);
    }
}
