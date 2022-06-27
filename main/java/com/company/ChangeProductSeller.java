package com.company;

import com.company.entity.classes.Admin;
import com.company.entity.classes.Goods;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ChangeProductSeller {
    int index;
    @FXML
    private Button btnDone;

    @FXML
    private RadioButton nameRadio;

    @FXML
    private TextField newText;

    @FXML
    private RadioButton priceRadio;

    @FXML
    private ListView<String> productListview;

    public void initialize() {
        final ObservableList<String> observableList = FXCollections.observableArrayList();
        int i = 1;
        for (Goods a : HelloApplication.salePerson.saledGoods) {
            observableList.add(i + " ." + a.getName() + "   " + a.getBrand() + "   " + a.getPrice());
        }
        productListview.setItems(observableList);
    }

    @FXML
    void pressonDone(ActionEvent event) {
        HelloApplication.salePerson.saledGoods.get(index).setConfirmStatus(false);
        Admin.chngedProducts.add(HelloApplication.salePerson.saledGoods.get(index));
        if (nameRadio.isSelected())
            HelloApplication.salePerson.saledGoods.get(index).setName(newText.getText());
        else
            HelloApplication.salePerson.saledGoods.get(index).setPrice(Long.parseLong(newText.getText()));

    }

    @FXML
    void pressonName(ActionEvent event) {
        nameRadio.setSelected(true);
        priceRadio.setSelected(false);
    }

    @FXML
    void pressonPrice(ActionEvent event) {
        nameRadio.setSelected(false);
        priceRadio.setSelected(true);
    }

    @FXML
    void pressonProduct(MouseEvent event) {
        index=productListview.getSelectionModel().getSelectedIndex();
    }

}
