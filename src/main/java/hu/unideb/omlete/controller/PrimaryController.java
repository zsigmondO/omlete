package hu.unideb.omlete.controller;

import hu.unideb.omlete.database.dao.FoodDAO;
import hu.unideb.omlete.database.dao.impl.FoodDAOImpl;
import hu.unideb.omlete.database.entity.Food;
import hu.unideb.omlete.main.App;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class PrimaryController {

    private FoodDAO foodDAO = new FoodDAOImpl();

    @FXML
    private AnchorPane paneOfImageViews;


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
        List<ImageView> imageViews = new ArrayList<>();

        foods.forEach(food -> {
            URL url = getClass().getResource("/images/food/" + food.getImage());
            Image image = new Image(url.toString());
            ImageView imageView = new ImageView(image);
            imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    System.out.println("Szia! " + food.getId() + " ez az ájdi!");
                }
            });
            imageViews.add(imageView);
        });
        paneOfImageViews = new AnchorPane();
        paneOfImageViews.getChildren().addAll(imageViews);
        System.out.println(foods);

        System.out.println("Szép volt báttya! :)");
    }
}
