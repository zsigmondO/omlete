module com.softdev {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.softdev to javafx.fxml;
    exports com.softdev;
}