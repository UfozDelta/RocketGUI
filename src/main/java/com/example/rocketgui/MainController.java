package com.example.rocketgui;

/*
 * Class Controller that allows interaction between
 * gui that is used to interact
 * with rocket object and FXML buttons
 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.stage.Stage;


import java.io.IOException;


public class MainController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label infoText;

    @FXML
    protected  void onNoseConeButtonClick() {
        infoText.setText("Hello");
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onBodyTubeButtonClick() {
        infoText.setText("Goodbye!");
    }

    @FXML
    private void handleOpenNewWindow() {
        try {

            // Load new FXML details
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NoseCone.fxml"));
            Parent root = fxmlLoader.load();

            // Create a new window
            Stage stage = new Stage();
            stage.setTitle("Nose Cone");
            stage.setScene(new Scene(root));

            //Show
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
