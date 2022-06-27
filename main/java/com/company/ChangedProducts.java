package com.company;

import com.company.entity.classes.Admin;
import com.company.entity.classes.Goods;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import static com.company.entity.classes.Admin.chngedProducts;

public class ChangedProducts {
    @FXML
    private ListView<String> listviewProduct;

    @FXML
    void pressonProduct(MouseEvent event) {
        chngedProducts.get(listviewProduct.getSelectionModel().getSelectedIndex()).setConfirmStatus(true);
        Admin.realGoods.add(chngedProducts.get(listviewProduct.getSelectionModel().getSelectedIndex()));
        initialize();
    }

    public void initialize() {
        int i = 1;
        final ObservableList<String> observableList = FXCollections.observableArrayList();
        for (Goods a : chngedProducts)
            observableList.add(i++ + ". " + a.getName() + "   " + a.getBrand() + "   " + a.getPrice() + "  " + a.getSellerCompanyName() + "   " + a.getSellerName());
        listviewProduct.setItems(observableList);
    }
}
