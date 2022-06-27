package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SellerPanel {

    @FXML
    private Button btnAddaProduct;

    @FXML
    private Button btnChangepersonalinfo;

    @FXML
    private Button btnDeleteaproduct;

    @FXML
    private Button btnEditProductInfo;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnSaleHistory;

    @FXML
    void pressonAddaProduct(ActionEvent event) {
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("AddProduct.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void pressonChangepersonalinfo(ActionEvent event) {
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("ChangePersonalInfo.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void pressonLogout(ActionEvent event) {
        HelloApplication.salePerson=null;
        Stage stage = (Stage) btnLogout.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("loginPage.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void pressonSaleHistory(ActionEvent event) {

    }

    @FXML
    void pressonbtnDeleteaproduct(ActionEvent event) {

    }

    @FXML
    void pressonbtnEditProductInfo(ActionEvent event) {

    }

}
