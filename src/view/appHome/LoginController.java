package view.appHome;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import services.Navigation;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField uNameTextField;

    @FXML
    private TextField uPasswordTextField;

    @FXML
    private Label uValidationLabel;

    @FXML
    private void showData(ActionEvent event){
        uValidationLabel.setText(uNameTextField.getText()+" is invalid");
    }

    @FXML
    public void loadHome(ActionEvent actionEvent){
        Navigation navigation = new Navigation();
        navigation.loadHome(actionEvent);
    }
}
