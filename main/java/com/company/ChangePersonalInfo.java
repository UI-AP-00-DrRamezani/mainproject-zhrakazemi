package com.company;

import com.company.entity.classes.Admin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ChangePersonalInfo {

    @FXML
    private Button btnDone;

    @FXML
    private RadioButton btnEmail;

    @FXML
    private RadioButton btnName;

    @FXML
    private RadioButton btnPhoneNum;

    @FXML
    private RadioButton btnlName;

    @FXML
    private RadioButton btnpass;

    @FXML
    private TextField txtnewInfo;

    @FXML
    void ChangeEmail(ActionEvent event) {
        btnEmail.setSelected(true);
        btnlName.setSelected(false);
        btnpass.setSelected(false);
        btnlName.setSelected(false);
        btnPhoneNum.setSelected(false);
    }

    @FXML
    void ChangeLastName(ActionEvent event) {
        btnEmail.setSelected(false);
        btnlName.setSelected(false);
        btnpass.setSelected(false);
        btnlName.setSelected(true);
        btnPhoneNum.setSelected(false);
    }

    @FXML
    void ChangePhoneNum(ActionEvent event) {
        btnEmail.setSelected(false);
        btnlName.setSelected(false);
        btnpass.setSelected(false);
        btnlName.setSelected(false);
        btnPhoneNum.setSelected(true);
    }

    @FXML
    void changeName(ActionEvent event) {
        btnEmail.setSelected(false);
        btnlName.setSelected(true);
        btnpass.setSelected(false);
        btnlName.setSelected(false);
        btnPhoneNum.setSelected(false);
    }

    @FXML
    void changePass(ActionEvent event) {
        btnEmail.setSelected(false);
        btnlName.setSelected(false);
        btnpass.setSelected(true);
        btnlName.setSelected(false);
        btnPhoneNum.setSelected(false);
    }

    @FXML
    void pressonDonebtn(ActionEvent event) {
        if(HelloApplication.buyer!=null){
            if (btnEmail.isSelected())
                HelloApplication.buyer.setEmail(txtnewInfo.getText());
            if (btnpass.isSelected())
                HelloApplication.buyer.setPassword(txtnewInfo.getText());
            if (btnlName.isSelected())
                HelloApplication.buyer.setLastName(txtnewInfo.getText());
            if (btnPhoneNum.isSelected())
                HelloApplication.buyer.setPhoneNumber(Long.parseLong(txtnewInfo.getText()));
            if (btnName.isSelected())
                HelloApplication.buyer.setName(txtnewInfo.getText());
            String sql = String.format("update account set name='%s' where username = %s", HelloApplication.buyer.getName(),HelloApplication.buyer.getUserName());
            Connection con;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/shop", "root", "");
                Statement s = con.prepareStatement(sql);
                s.execute(sql);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else if (HelloApplication.salePerson!=null) {
            if (btnEmail.isSelected())
                HelloApplication.salePerson.setEmail(txtnewInfo.getText());
            if (btnpass.isSelected())
                HelloApplication.salePerson.setPassword(txtnewInfo.getText());
            if (btnlName.isSelected())
                HelloApplication.salePerson.setLastName(txtnewInfo.getText());
            if (btnPhoneNum.isSelected())
                HelloApplication.salePerson.setPhoneNumber(Long.parseLong(txtnewInfo.getText()));
            if (btnName.isSelected())
                HelloApplication.salePerson.setName(txtnewInfo.getText());
            String sql = String.format("update account set name='%s' where username = %s", HelloApplication.salePerson.getName(),HelloApplication.salePerson.getUserName());
            Connection con;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/shop", "root", "");
                Statement s = con.prepareStatement(sql);
                s.execute(sql);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            if (btnEmail.isSelected())
                Admin.newAdmin.setEmail(txtnewInfo.getText());
            if (btnpass.isSelected())
                Admin.newAdmin.setPassword(txtnewInfo.getText());
            if (btnlName.isSelected())
                Admin.newAdmin.setLastName(txtnewInfo.getText());
            if (btnPhoneNum.isSelected())
                Admin.newAdmin.setPhoneNumber(Long.parseLong(txtnewInfo.getText()));
            if (btnName.isSelected())
                Admin.newAdmin.setName(txtnewInfo.getText());
        }
    }

}
