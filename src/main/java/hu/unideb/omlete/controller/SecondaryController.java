package hu.unideb.omlete.controller;


import hu.unideb.omlete.main.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");

        System.out.println("valami in Secondary");
    }
}