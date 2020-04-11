package hu.unideb.omlete.controller;

import hu.unideb.omlete.main.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class PrimaryController {


    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");

        System.out.println("Valami in Primary");
    }
}
