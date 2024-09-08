package com.gui.rocketgui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private LineChart<Number, Number> chart;

    @FXML
    private void openTriangleDialog() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("NoseCone.fxml"));
        Parent root = loader.load();

        NoseConeController noseConeController = loader.getController();
        noseConeController.setMainController(this);

        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.APPLICATION_MODAL);
        dialogStage.setTitle("Create Triangle");
        dialogStage.setScene(new Scene(root));
        dialogStage.showAndWait();
    }

    public void plotTriangle(double base, double height) {
        chart.getData().clear(); // Clear previous data

        // Line from tip to top of base
        XYChart.Series<Number, Number> series1 = new XYChart.Series<>();
        series1.getData().add(new XYChart.Data<>(0, 0));
        series1.getData().add(new XYChart.Data<>(height, -base/2));
        chart.getData().add(series1);

        // Line from top of base to bottom of base
        XYChart.Series<Number, Number> series2 = new XYChart.Series<>();
        series2.getData().add(new XYChart.Data<>(height, -base/2));
        series2.getData().add(new XYChart.Data<>(height, base/2));
        chart.getData().add(series2);

        // Line from bottom of base back to tip
        XYChart.Series<Number, Number> series3 = new XYChart.Series<>();
        series3.getData().add(new XYChart.Data<>(height, base/2));
        series3.getData().add(new XYChart.Data<>(0, 0));
        chart.getData().add(series3);
    }

}