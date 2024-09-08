package com.gui.rocketgui;

import com.gui.rocketgui.MainController;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NoseConeController {

    @FXML private TextField baseField;
    @FXML private TextField heightField;

    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    private void createTriangle() {
        try {
            double base = Double.parseDouble(baseField.getText());
            double height = Double.parseDouble(heightField.getText());

            if (base <= 0 || height <= 0) {
                throw new IllegalArgumentException("Base and height must be positive numbers.");
            }

            mainController.plotTriangle(base, height);

            // Close the dialog
            ((Stage) baseField.getScene().getWindow()).close();
        } catch (NumberFormatException e) {
            // Handle invalid input
            System.err.println("Invalid input. Please enter valid numbers for base and height.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}