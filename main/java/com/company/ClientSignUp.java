package com.company;

import com.company.entity.classes.Buyer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.company.MainMenu.OnlineShopPanel.buyers;

public class ClientSignUp {

    @FXML
    private Button clientLogin;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtPhoneNum;

    @FXML
    private TextField txtlastName;

    @FXML
    private TextField txtmoney;

    @FXML
    void pressonClientLogin(ActionEvent event) {
        Buyer buyer = new Buyer(txtId.getText(), txtName.getText(), txtlastName.getText(), txtEmail.getText(),
                Long.parseLong(txtPhoneNum.getText()), txtPassword.getText(), Long.parseLong(txtmoney.getText()));
        String sql = String.format("INSERT INTO account VALUES ('%s','%s','%s','%s',%s,'0')", txtId.getText(), txtName.getText()
                , txtlastName.getText(), txtPassword.getText(), txtPhoneNum.getText());
        String sql2 = String.format("INSERT INTO email VALUES ('%s','%s')", txtId.getText(), txtEmail.getText());
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/shop", "root", "");
            Statement s = con.prepareStatement(sql);
            s.execute(sql);
            Statement s2 = con.prepareStatement(sql2);
            s2.execute(sql2);
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        buyers.add(buyer);
        Stage stage = (Stage) clientLogin.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("LoginPage.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    }
