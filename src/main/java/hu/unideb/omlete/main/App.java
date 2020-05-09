package hu.unideb.omlete.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class App extends Application {

    private static Scene scene;

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        return FXMLLoader.load(Objects.requireNonNull(App.class.getClassLoader().getResource("view/" + fxml + ".fxml")));
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            scene = new Scene(loadFXML("welcome"));
            stage.setScene(scene);
            stage.setTitle("omlete");
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            System.out.println(" " + e.getCause());
        }
    }
}