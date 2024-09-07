package com.example.rocketgui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShapeOnChart extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a button
        Button button = new Button("Show Square");

        // Create a layout
        BorderPane root = new BorderPane();

        // Set the button in the center
        root.setCenter(button);

        // Create a scene
        Scene scene = new Scene(root, 400, 400);

        // Define action when button is clicked
        button.setOnAction(e -> {
            // Create a square (Rectangle with equal width and height)
            Rectangle square = new Rectangle(100, 100, Color.BLUE);

            // Add the square to the bottom of the screen
            root.setBottom(square);
        });

        // Set the title of the stage
        primaryStage.setTitle("Square Display App");

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

