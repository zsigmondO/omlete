package com.softdev.Controller;

import com.softdev.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class PrimaryController {

    @FXML
    public void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
