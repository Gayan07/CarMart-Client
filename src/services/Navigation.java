package services;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigation {

    public void loadHome(ActionEvent actionEvent){
        try {
            AnchorPane home_page = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/appHome/home.fxml"));
            Scene scene = new Scene(home_page);
            Stage app=(Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            app.setScene(scene);
            app.show();
        } catch (IOException ex) {

        }
    }
    public void loadOrder(ActionEvent actionEvent){
        try {
            AnchorPane home_page = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/appHome/order.fxml"));
            Scene scene = new Scene(home_page);
            Stage app=(Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            app.setScene(scene);
            app.show();
        } catch (IOException ex) {

        }
    }

    public void loadVehicleInfo(ActionEvent actionEvent){
        try {
            AnchorPane home_page = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/appHome/VehicleInfo.fxml"));
            Scene scene = new Scene(home_page);
            Stage app=(Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            app.setScene(scene);
            app.show();
        } catch (IOException ex) {
            System.out.println(ex);

        }
    }
    public void loadSpecificVehicleInfo(MouseEvent mouseEvent){
        try {
            AnchorPane home_page = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/appHome/VehicleInfo.fxml"));
            Scene scene = new Scene(home_page);
            Stage app=(Stage)((Node) mouseEvent.getSource()).getScene().getWindow();
            app.setScene(scene);
            app.show();
        } catch (IOException ex) {
            System.out.println(ex);

        }
    }
    public void loadFindModel(ActionEvent actionEvent){
        try {
            AnchorPane home_page = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/appHome/findModel.fxml"));
            Scene scene = new Scene(home_page);
            Stage app=(Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            app.setScene(scene);
            app.show();
        } catch (IOException ex) {
            System.out.println(ex);

        }
    }

}
