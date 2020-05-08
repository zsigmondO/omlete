package hu.unideb.omlete.controller;


import hu.unideb.omlete.main.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class WelcomeController {
    @FXML
    private Button categoryButton;

    @FXML
    private Button createShoppingList;

    @FXML
    void switchToCategory(ActionEvent event) throws IOException {
        App.setRoot("food_by_category.fxml");
    }

    @FXML
    void switchToShoppingList(ActionEvent event) throws IOException {
        App.setRoot("create_shopping_list.fxml");
    }
}