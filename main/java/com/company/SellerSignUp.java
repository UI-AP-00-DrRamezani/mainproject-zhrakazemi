



package com.company;

import com.company.MainMenu.OnlineShopPanel;
import com.company.entity.classes.SalePerson;
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

public class SellerSignUp {

    @FXML
    private Button btnDone;

    @FXML
    private TextField txtCompanyCode;

    @FXML
    private TextField txtCompanyNme;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPass;

    @FXML
    private TextField txtPhoneNum;

    @FXML
    void pressonDoneBtn(ActionEvent event) {
        SalePerson seller = new SalePerson(txtId.getText(),txtName.getText(), txtLastName.getText(), txtEmail.getText(), Long.parseLong(txtPhoneNum.getText())
                ,txtPass.getText(), txtCompanyNme.getText(), txtCompanyCode.getText());
        String sql = String.format("INSERT INTO account VALUES ('%s','%s','%s','%s',%s,'1')", txtId.getText(), txtName.getText()
                , txtLastName.getText(), txtPass.getText(), txtPhoneNum.getText());
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
        OnlineShopPanel.sellers.add(seller);
        Stage stage = (Stage) btnDone.getScene().getWindow();
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






