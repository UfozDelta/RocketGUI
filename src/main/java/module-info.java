module com.example.rocketgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rocketgui to javafx.fxml;
    exports com.example.rocketgui;
}