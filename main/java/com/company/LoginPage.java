
package com.company;

import com.company.entity.classes.Admin;
import com.company.entity.classes.Buyer;
import com.company.entity.classes.SalePerson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

import static com.company.MainMenu.OnlineShopPanel.buyers;

public class LoginPage {

    @FXML
    private RadioButton bntAdminLogin;

    @FXML
    private Button btnLogin;

    @FXML
    private RadioButton btnSellerLogin;

    @FXML
    private Button btnSinUp;

    @FXML
    private RadioButton btnclientlogin;

    @FXML
    private Button btnviewProduct;

    @FXML
    private TextField txtpassword;

    @FXML
    private TextField txtuserName;

    @FXML
    void pressOnSelerLogin(ActionEvent event) {
        btnclientlogin.setSelected(false);
        bntAdminLogin.setSelected(false);
        btnSellerLogin.setSelected(true);

    }

    @FXML
    void pressonAdminLogin(ActionEvent event) {
        btnclientlogin.setSelected(false);
        bntAdminLogin.setSelected(true);
        btnSellerLogin.setSelected(false);

    }

    @FXML
    void pressonBtnLogin(ActionEvent event) {
        if (bntAdminLogin.isSelected()) {
            if (txtuserName.getText().equals("admin")) {
                if (txtpassword.getText().equals("admin")) {
                    Stage stage = (Stage) bntAdminLogin.getScene().getWindow();
                    stage.close();
                    Stage primaryStage = new Stage();
                    AnchorPane root = null;
                    try {
                        root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("AdminPanel.fxml"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Scene scene = new Scene(root, 800, 500);
                    primaryStage.setScene(scene);
                    primaryStage.show();
                }
            }
        } else if (btnSellerLogin.isSelected()) {
            boolean one = false;
            boolean two = false;
            SalePerson b = null;
            for (SalePerson a : Admin.reallSellers) {
                if (txtuserName.getText().equals(a.getUserName())) {
                    one = true;
                    if (txtpassword.getText().equals(a.getPassword())) {
                        two = true;
                        b = a;
                    }
                }
            }
            if (one == true && two == true) {
                HelloApplication.salePerson = b;
                Stage stage = (Stage) btnSellerLogin.getScene().getWindow();
                stage.close();
                Stage primaryStage = new Stage();
                AnchorPane root = null;
                try {
                    root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("SellerPanel.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root, 800, 500);
                primaryStage.setScene(scene);
                primaryStage.show();
            } else {
                Alert alert6 = new Alert(Alert.AlertType.INFORMATION);
                alert6.setTitle("Warning");
                alert6.setContentText("Invalid Information!");
                alert6.showAndWait();
            }
        } else if (btnclientlogin.isSelected()) {
            for (Buyer a : buyers) {
                if (a.getUserName().equals(txtuserName.getText())) {
                    if (txtpassword.getText().equals(a.getPassword())) {
                        //newbuyer[0] = a;
                        HelloApplication.buyer = a;
                        Stage stage = (Stage) btnclientlogin.getScene().getWindow();
                        stage.close();
                        Stage primaryStage = new Stage();
                        AnchorPane root = null;
                        try {
                            root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("BuyerPanel.fxml"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Scene scene = new Scene(root, 800, 500);
                        primaryStage.setScene(scene);
                        primaryStage.show();
                    }
                }
            }
        }
    }

    @FXML
    void pressonClientLogin(ActionEvent event) {
        btnclientlogin.setSelected(true);
        bntAdminLogin.setSelected(false);
        btnSellerLogin.setSelected(false);
    }

    @FXML
    void pressonSignUp(ActionEvent event) {
        Stage stage = (Stage) btnSinUp.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = null;
        try {
            root = (AnchorPane) FXMLLoader.load(HelloApplication.class.getResource("StartingSignUp.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void pressonViewingProducts(ActionEvent event) {

    }

}





