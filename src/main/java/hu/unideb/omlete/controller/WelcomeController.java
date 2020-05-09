package hu.unideb.omlete.controller;


import hu.unideb.omlete.main.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
//import javafx.scene.
import java.io.IOException;

public class WelcomeController {


    @FXML
    private Button categoryButton;


    //@FXML
    //private MediaView mediaView;


    @FXML
    void switchToCategory(ActionEvent event) throws IOException {
        App.setRoot("food_by_category");
    }

}