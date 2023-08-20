package view.appHome;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;
import services.Navigation;

public class VehicleInfoContoller {

    @FXML
    private MenuBar menuBar;

    @FXML
    public void loadHome(ActionEvent actionEvent){
        Navigation navigation = new Navigation();
        navigation.loadHome(actionEvent);
    }
    @FXML
    public void loadOrder(ActionEvent actionEvent){
        Navigation navigation = new Navigation();
        navigation.loadOrder(actionEvent);
    }

    @FXML
    public void loadVehicleInfo(ActionEvent actionEvent){
        Navigation navigation = new Navigation();
        navigation.loadVehicleInfo(actionEvent);
    }
    @FXML
    public void loadFindModel(ActionEvent actionEvent){
        Navigation navigation = new Navigation();
        navigation.loadFindModel(actionEvent);
    }

}
