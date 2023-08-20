package view.appHome;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Request1;
import services.Navigation;
import services.client.RMIClient;
import util.utility.AlertPopUp;
import util.validation.DataValidation;

import java.net.URL;
import java.util.ResourceBundle;

public class OrderController implements Initializable {

    @FXML
    private TextField brandNameTextField;

    @FXML
    private TextField modelTextField;

    @FXML
    private TextField colorTextField;

    @FXML
    private TextField customerNameTextField;

    @FXML
    private TextField customerEmailTextField;

    @FXML
    private TextField customerPhoneTextField;

    @FXML
    private Label brandNameLabel;

    @FXML
    private Label modelLabel;

    @FXML
    private Label colorLabel;

    @FXML
    private Label customerNameLabel;

    @FXML
    private Label customerEmailLabel;

    @FXML
    private Label customerPhoneLabel;

    @FXML
    public void loadHome(ActionEvent actionEvent) {
        Navigation navigation = new Navigation();
        navigation.loadHome(actionEvent);
    }

    @FXML
    public void loadOrder(ActionEvent actionEvent) {
        Navigation navigation = new Navigation();
        navigation.loadOrder(actionEvent);
    }

    @FXML
    public void loadVehicleInfo(ActionEvent actionEvent) {
        Navigation navigation = new Navigation();
        navigation.loadVehicleInfo(actionEvent);
    }

    @FXML
    public void loadFindModel(ActionEvent actionEvent) {
        Navigation navigation = new Navigation();
        navigation.loadFindModel(actionEvent);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void addRequest(ActionEvent actionEvent) {
        clearLabels();
        if (dataValidation()) {
            Request1 request = new Request1();
            request.setrBrandName(brandNameTextField.getText());
            request.setrModel(modelTextField.getText());
            request.setrColor(colorTextField.getText());
            request.setrCusName(customerNameTextField.getText());
            request.setrCusEmail(customerEmailTextField.getText());
            request.setrContactNo(Integer.parseInt(customerPhoneTextField.getText()));
            try {

                if (RMIClient.theInterface.addRequest(request)) {
                    AlertPopUp.insertSuccesfully("Request Sent Successfully");
                    clearFields();
                } else
                    AlertPopUp.insertionFailed("Failed to send New Request");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            datavalidationMessage();
        }
    }

    private Boolean dataValidation() {
        if (DataValidation.TextFieldNotEmpty(brandNameTextField.getText())
                && DataValidation.TextFieldNotEmpty(modelTextField.getText())
                && DataValidation.TextFieldNotEmpty(colorTextField.getText())
                && DataValidation.TextFieldNotEmpty(customerNameTextField.getText())
                && DataValidation.TextFieldNotEmpty(customerEmailTextField.getText())
                && DataValidation.TextFieldNotEmpty(customerPhoneTextField.getText())

                //checking maximum exceeded

                && DataValidation.isValidMaximumLength(brandNameTextField.getText(), 45)
                && DataValidation.isValidMaximumLength(modelTextField.getText(), 45)
                && DataValidation.isValidMaximumLength(colorTextField.getText(), 20)
                && DataValidation.isValidMaximumLength(customerNameTextField.getText(), 45)
                && DataValidation.isValidMaximumLength(customerEmailTextField.getText(), 45)

                //validate special data
                && DataValidation.isValidEmail(customerEmailTextField.getText())
                && DataValidation.isValidPhoneNo(customerPhoneTextField.getText())

        ) return true;
        return false;
    }

    private void datavalidationMessage() {
        if (!(DataValidation.TextFieldNotEmpty(brandNameTextField.getText())
                && DataValidation.TextFieldNotEmpty(modelTextField.getText())
                && DataValidation.TextFieldNotEmpty(colorTextField.getText())
                && DataValidation.TextFieldNotEmpty(customerNameTextField.getText())
                && DataValidation.TextFieldNotEmpty(customerEmailTextField.getText())
                && DataValidation.TextFieldNotEmpty(customerPhoneTextField.getText()))) {
            DataValidation.TextFieldNotEmpty(brandNameTextField.getText(), brandNameLabel, "Brand name field can not be empty");
            DataValidation.TextFieldNotEmpty(modelTextField.getText(), modelLabel, "Model field can not be empty");
            DataValidation.TextFieldNotEmpty(colorTextField.getText(), colorLabel, "Colour field can not be empty");
            DataValidation.TextFieldNotEmpty(customerNameTextField.getText(), customerNameLabel, "Customer name field can not be empty");
            DataValidation.TextFieldNotEmpty(customerEmailTextField.getText(), customerEmailLabel, "Customer email field can not be empty");
            DataValidation.TextFieldNotEmpty(customerPhoneTextField.getText(), customerPhoneLabel, "Customer phone field can not be empty");

        }

        //checking maximum exceeded

        if (!(DataValidation.isValidMaximumLength(brandNameTextField.getText(), 45)
                && DataValidation.isValidMaximumLength(modelTextField.getText(), 45)
                && DataValidation.isValidMaximumLength(colorTextField.getText(), 20)
                && DataValidation.isValidMaximumLength(customerNameTextField.getText(), 45)
                && DataValidation.isValidMaximumLength(customerEmailTextField.getText(), 45))) {
            DataValidation.isValidMaximumLength(brandNameTextField.getText(), 45, brandNameLabel, "Maximun character length exceed.LIMIT(45)");
            DataValidation.isValidMaximumLength(modelTextField.getText(), 45, modelLabel, "Maximun character length exceed.LIMIT(45)");
            DataValidation.isValidMaximumLength(colorTextField.getText(), 20, colorLabel, "Maximun character length exceed.LIMIT(20)");
            DataValidation.isValidMaximumLength(customerNameTextField.getText(), 45, customerNameLabel, "Maximun character length exceed.LIMIT(45)");
            DataValidation.isValidMaximumLength(customerEmailTextField.getText(), 45, customerEmailLabel, "Maximun character length exceed.LIMIT(45)");
        }

        //validate special data
        if (!(DataValidation.isValidEmail(customerEmailTextField.getText())
                && DataValidation.isValidPhoneNo(customerPhoneTextField.getText()))) {
            DataValidation.isValidEmail(customerEmailTextField.getText(), customerEmailLabel, "Invalid email number");
            DataValidation.isValidPhoneNo(customerPhoneTextField.getText(), customerPhoneLabel, "Invalid phone number");
        }
    }

    @FXML
    private void clearFields() {
        brandNameTextField.setText("");
        modelTextField.setText("");
        colorTextField.setText("");
        customerNameTextField.setText("");
        customerEmailTextField.setText("");
        customerPhoneTextField.setText("");

    }

    @FXML
    private void clearLabels() {
        brandNameLabel.setText("");
        modelLabel.setText("");
        colorLabel.setText("");
        customerNameLabel.setText("");
        customerEmailLabel.setText("");
        customerPhoneLabel.setText("");

    }
}
