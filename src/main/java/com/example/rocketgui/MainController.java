package com.example.rocketgui;

/*
 * Class Controller that allows interaction between
 * gui that is used to interact
 * with rocket object and FXML buttons
 */

import javafx.fxml.FXML;
import javafx.scene.control.Label;

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
}
