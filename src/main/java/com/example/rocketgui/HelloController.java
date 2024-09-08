package com.example.rocketgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
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
