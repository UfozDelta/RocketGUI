module com.example.rocketgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gui.rocketgui to javafx.fxml;
    exports com.gui.rocketgui;
}