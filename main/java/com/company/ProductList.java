package com.company;

import com.company.entity.classes.*;
import com.company.panels.CategoryPanel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ProductList {
    ArrayList<Goods> goods;

    @FXML
    private ListView<String> listviewProduct;

    @FXML
    private RadioButton radioCellphone;

    @FXML
    private RadioButton radioFood;

    @FXML
    private RadioButton radioLaptop;

    @FXML
    private RadioButton radioOven;

    @FXML
    private RadioButton radioRefrigerator;

    @FXML
    private RadioButton radioShirt;

    @FXML
    private RadioButton radioShoe;

    @FXML
    private RadioButton radioTv;

    @FXML
    void pressonCellphone(ActionEvent event) {
        radioCellphone.setSelected(true);
        radioFood.setSelected(false);
        radioLaptop.setSelected(false);
        radioOven.setSelected(false);
        radioRefrigerator.setSelected(false);
        radioShirt.setSelected(false);
        radioShoe.setSelected(false);
        radioTv.setSelected(false);
        goods = new ArrayList<>();
        for (CellPhone a : CategoryPanel.cellPhones)
            goods.add(a);
        setListview();

    }

    @FXML
    void pressonFood(ActionEvent event) {
        radioCellphone.setSelected(false);
        radioFood.setSelected(true);
        radioLaptop.setSelected(false);
        radioOven.setSelected(false);
        radioRefrigerator.setSelected(false);
        radioShirt.setSelected(false);
        radioShoe.setSelected(false);
        radioTv.setSelected(false);
        goods = new ArrayList<>();
        for (Food a : CategoryPanel.foods)
            goods.add(a);
        setListview();

    }

    @FXML
    void pressonLaptop(ActionEvent event) {
        radioCellphone.setSelected(false);
        radioFood.setSelected(false);
        radioLaptop.setSelected(true);
        radioOven.setSelected(false);
        radioRefrigerator.setSelected(false);
        radioShirt.setSelected(false);
        radioShoe.setSelected(false);
        radioTv.setSelected(false);
        goods = new ArrayList<>();
        for (Loptop a : CategoryPanel.loptops)
            goods.add(a);
        setListview();

    }

    @FXML
    void pressonOven(ActionEvent event) {
        radioCellphone.setSelected(false);
        radioFood.setSelected(false);
        radioLaptop.setSelected(false);
        radioOven.setSelected(true);
        radioRefrigerator.setSelected(false);
        radioShirt.setSelected(false);
        radioShoe.setSelected(false);
        radioTv.setSelected(false);
        goods = new ArrayList<>();
        for (Oven a : CategoryPanel.ovens)
            goods.add(a);
        setListview();

    }

    @FXML
    void pressonProduct(MouseEvent event) {
        ProductPage.goods = goods.get(listviewProduct.getSelectionModel().getSelectedIndex());
        Stage stage = (Stage) listviewProduct.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("productPage.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void pressonRefrigerator(ActionEvent event) {
        radioCellphone.setSelected(false);
        radioFood.setSelected(false);
        radioLaptop.setSelected(false);
        radioOven.setSelected(false);
        radioRefrigerator.setSelected(true);
        radioShirt.setSelected(false);
        radioShoe.setSelected(false);
        radioTv.setSelected(false);
        goods = new ArrayList<>();
        for (Rifrigirator a : CategoryPanel.rifrigirators)
            goods.add(a);
        setListview();

    }

    @FXML
    void pressonShirt(ActionEvent event) {
        radioCellphone.setSelected(false);
        radioFood.setSelected(false);
        radioLaptop.setSelected(false);
        radioOven.setSelected(false);
        radioRefrigerator.setSelected(false);
        radioShirt.setSelected(true);
        radioShoe.setSelected(false);
        radioTv.setSelected(false);
        goods = new ArrayList<>();
        for (Shirt a : CategoryPanel.shirt)
            goods.add(a);
        setListview();

    }

    @FXML
    void pressonShoe(ActionEvent event) {
        radioCellphone.setSelected(false);
        radioFood.setSelected(false);
        radioLaptop.setSelected(false);
        radioOven.setSelected(false);
        radioRefrigerator.setSelected(false);
        radioShirt.setSelected(false);
        radioShoe.setSelected(true);
        radioTv.setSelected(false);
        goods = new ArrayList<>();
        for (Shoes a : CategoryPanel.shoes)
            goods.add(a);
        setListview();
    }

    @FXML
    void pressonTv(ActionEvent event) {
        radioCellphone.setSelected(false);
        radioFood.setSelected(false);
        radioLaptop.setSelected(false);
        radioOven.setSelected(false);
        radioRefrigerator.setSelected(false);
        radioShirt.setSelected(false);
        radioShoe.setSelected(false);
        radioTv.setSelected(true);
        goods = new ArrayList<>();
        for (TV a : CategoryPanel.tvs)
            goods.add(a);
        setListview();
    }

    void setListview() {
        final ObservableList<String> observableList = FXCollections.observableArrayList();
        for(Goods a:goods)
            observableList.add(a.getName() + "   " + a.getBrand() + "   " + a.getPrice() + "  " + a.getSellerCompanyName() + "   " + a.getSellerName());
        listviewProduct.setItems(observableList);
    }
}
