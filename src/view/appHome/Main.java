package view.appHome;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import services.client.RMIClient;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        RMIClient.startClient();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Car Mart - Client");
        primaryStage.setScene(new Scene(root, 1280, 1000));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
