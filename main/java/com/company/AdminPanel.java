package com.company;

import com.company.MainMenu.OnlineShopPanel;
import com.company.entity.classes.Admin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.InputMismatchException;

public class AdminPanel {

    @FXML
    private Button btnAcceptingChangedProducts;

    @FXML
    private Button btnCategoriesList;

    @FXML
    private Button btnLogOut;

    @FXML
    private Button btnProductRequests;

    @FXML
    private Button btnVeiwUsersList;

    @FXML
    private Button btnchangingpersonalinfo;

    @FXML
    private Button btnsalespersonregistrationrequest;

    @FXML
    void pressonAcceptingChangedProducts(ActionEvent event) {
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("changedProducts.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void pressonCategoriesList(ActionEvent event) {
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("ProductList.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void pressonChangingPersonalInfo(ActionEvent event) {
        Stage stage = (Stage) btnCategoriesList.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("ChangePersonalInfo.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    @FXML
    void pressonLogOut(ActionEvent event) {
        Stage stage = (Stage) btnLogOut.getScene().getWindow();
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
    void pressonProductRequests(ActionEvent event) {
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("productRequest.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void pressonViewUsersList(ActionEvent event) {
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("userList.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void pressonsalespersonregistrationrequest(ActionEvent event) {
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("salePersonRequest.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

