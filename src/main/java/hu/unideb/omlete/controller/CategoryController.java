package hu.unideb.omlete.controller;

import hu.unideb.omlete.database.dao.FoodDAO;
import hu.unideb.omlete.database.dao.impl.FoodDAOImpl;
import hu.unideb.omlete.database.entity.Food;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CategoryController {

    private FoodDAO foodDAO = new FoodDAOImpl();

    @FXML
    private GridPane paneOfImages = new GridPane();

    void insertImageToPane(List<ImageView> imageViews) {
        AtomicInteger row = new AtomicInteger();
        AtomicInteger column = new AtomicInteger();

        imageViews.forEach(imageView -> {
            if (column.equals(1)) {
                row.getAndIncrement();
                column.set(0);
            }

            paneOfImages.add(imageView, Integer.parseInt(column.toString()), Integer.parseInt(row.toString()));
            column.getAndIncrement();
        });
    }

    void getListOfImageViews(List<Food> foods, List<ImageView> imageViews) {
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
    }

    @FXML
    void pushBakedDishButton(ActionEvent event) {
        paneOfImages.getChildren().clear();

        List<Food> foods = foodDAO.findAllByCategoryId((long) 1);
        List<ImageView> imageViews = new ArrayList<>();

        paneOfImages.setHgap(10);
        paneOfImages.setVgap(10);

        getListOfImageViews(foods, imageViews);
        insertImageToPane(imageViews);
    }

    @FXML
    void pushBeefButton(ActionEvent event) {
        paneOfImages.getChildren().clear();

        List<Food> foods = foodDAO.findAllByCategoryId((long) 2);
        List<ImageView> imageViews = new ArrayList<>();

        paneOfImages.setHgap(10);
        paneOfImages.setVgap(10);

        getListOfImageViews(foods, imageViews);
        insertImageToPane(imageViews);
    }

    @FXML
    void pushChickenButton(ActionEvent event) {
        paneOfImages.getChildren().clear();

        List<Food> foods = foodDAO.findAllByCategoryId((long) 3);
        List<ImageView> imageViews = new ArrayList<>();

        paneOfImages.setHgap(10);
        paneOfImages.setVgap(10);

        getListOfImageViews(foods, imageViews);
        insertImageToPane(imageViews);
    }

    @FXML
    void pushDinnerButton(ActionEvent event) {
        paneOfImages.getChildren().clear();

        List<Food> foods = foodDAO.findAllByCategoryId((long) 4);
        List<ImageView> imageViews = new ArrayList<>();

        paneOfImages.setHgap(10);
        paneOfImages.setVgap(10);

        getListOfImageViews(foods, imageViews);
        insertImageToPane(imageViews);
    }

    @FXML
    void pushEasyButton(ActionEvent event) {

    }

    @FXML
    void pushHealthyButton(ActionEvent event) {

    }

    @FXML
    void pushKidFriendlyButton(ActionEvent event) {

    }

    @FXML
    void pushQuickButton(ActionEvent event) {

    }

    @FXML
    void pushVegetablesButton(ActionEvent event) {

    }
}
