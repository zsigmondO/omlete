package hu.unideb.omlete.controller;


import hu.unideb.omlete.main.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class WelcomeController {

    @FXML
    void switchToCategory(ActionEvent event) throws IOException {
        App.setRoot("food_by_category");
    }

}