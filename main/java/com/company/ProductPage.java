package com.company;

        import com.company.entity.classes.Goods;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Alert;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextArea;
        import javafx.scene.control.TextField;
        import javafx.scene.text.Text;

public class ProductPage {
    public static Goods goods;

    @FXML
    private Button btnAddToCart;

    @FXML
    private TextArea txtComent;

    @FXML
    private Text txtInfo;

    @FXML
    private TextField txtScore;

    public void initialize(){
        txtInfo.setText(goods.toString());
    }


    @FXML
    void pressonBtnAddtoCart(ActionEvent event) {
        if(HelloApplication.buyer!=null) {
            HelloApplication.buyer.cart.add(goods);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("warning");
            alert.setContentText("adding successfully");
            alert.showAndWait();
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("warning");
            alert.setContentText("login as buyer");
            alert.showAndWait();
        }
    }

}

