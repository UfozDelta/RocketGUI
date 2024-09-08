package com.gui.rocketgui;

/*
 * Class NoseCone Controller that allows interaction between
 * Main RocketGUI and NoseCone parameters
 *
 */

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NoseConeController {
    @FXML
    private Label displayText;

    @FXML
    protected void onDisplayButtonClick() {
        displayText.setText("Welcome to JavaFX Application!");
    }
}
