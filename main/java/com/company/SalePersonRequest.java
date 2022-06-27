package com.company;

import com.company.entity.classes.Admin;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import static com.company.MainMenu.OnlineShopPanel.sellers;

public class SalePersonRequest {

    @FXML
    private ListView<String> listviewSalePerson;

    public void initialize() {
        int i = 1;
        int size = sellers.size();
        final ObservableList<String> observableList = FXCollections.observableArrayList();
        for (int j = 0; j < size; j++) {
            observableList.add(i + " company name: " + sellers.get(j).getCompanyName() + "\n company registration number: " + sellers.get(j).getCompanyNo() +
                    "\n name and last name: " + sellers.get(j).getName() + sellers.get(j).getLastName() + "\n E_mail adress: " + sellers.get(j).getEmail());
            i++;
        }
        listviewSalePerson.setItems(observableList);
    }

    @FXML
    void pressonListviewSalePerson(MouseEvent event) {
        Admin.reallSellers.add(sellers.get(listviewSalePerson.getSelectionModel().getSelectedIndex()));
        sellers.remove(listviewSalePerson.getSelectionModel().getSelectedIndex());
        initialize();
    }


}
