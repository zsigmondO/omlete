package hu.unideb.omlete.controller;

import hu.unideb.omlete.database.dao.FoodDAO;
import hu.unideb.omlete.database.dao.impl.FoodDAOImpl;
import hu.unideb.omlete.database.entity.Food;
import hu.unideb.omlete.main.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;
import java.util.List;

public class PrimaryController {

    FoodDAO foodDAO = new FoodDAOImpl();

    @FXML
    private Button bakedDishButton;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");

        System.out.println("Valami in Primary");
    }

    @FXML
    void pushBakedDishButton(ActionEvent event) {
        List<Food> foods = foodDAO.findAllByCategoryId((long) 1);

        System.out.println(foods);

        System.out.println("Szép volt báttya! :)");
    }
}
