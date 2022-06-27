package com.company;

import com.company.entity.classes.Admin;
import com.company.entity.classes.CellPhone;
import com.company.panels.CategoryPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static java.awt.SystemColor.info;

public class AddProduct {

    @FXML
    private Button btnDone;

    @FXML
    private TextField txtBrand;

    @FXML
    private TextField txtCamera;

    @FXML
    private TextField txtCompanyName;

    @FXML
    private TextField txtExistance;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtMass;

    @FXML
    private TextField txtMemory;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtRam;

    @FXML
    private TextField txtSellerName;

    @FXML
    private TextField txtSinCard;

    @FXML
    private TextField txtSize;

    @FXML
    private TextField txtSystem;

    @FXML
    private TextField txtinfi;

    @FXML
    void pressonBtnDone(ActionEvent event) {
        CellPhone temp = new CellPhone(txtId.getText(), txtName.getText(), txtBrand.getText(),Long.parseLong(txtPrice.getText()) ,
                Boolean.getBoolean(txtExistance.getText()), txtinfi.getText(), txtCompanyName.getText()
                ,txtSellerName.getText(), Integer.parseInt(txtMemory.getText()), Integer.parseInt(txtRam.getText()),
                txtSystem.getText(), Double.parseDouble(txtMass.getText()),Double.parseDouble(txtSize.getText()) ,
                Integer.parseInt(txtSinCard.getText()), Integer.parseInt(txtCamera.getText()));
        Admin.notConfirmedGoods.add(temp);
        CategoryPanel.cellPhones.add(temp);
    }


}
