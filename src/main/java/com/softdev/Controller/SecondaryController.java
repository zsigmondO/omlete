package com.softdev.Controller;

import com.softdev.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class SecondaryController {

    @FXML
    public void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}