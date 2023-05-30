package com.example.kursach;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class coffee_shop {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox americano_box;

    @FXML
    private ImageView americano_img;

    @FXML
    private CheckBox capp_box;

    @FXML
    private ImageView capp_img;

    @FXML
    private Button check_button;

    @FXML
    private CheckBox doppio_box;

    @FXML
    private ImageView doppio_img;

    @FXML
    private CheckBox espres_box;

    @FXML
    private ImageView espres_img;

    @FXML
    private CheckBox latte_box;

    @FXML
    private ImageView latte_img;

    @FXML
    private CheckBox raf_box;

    @FXML
    private ImageView raf_img;

    @FXML
    void click(ActionEvent event) {

    }

    @FXML
    void initialize() {
        check_button.setOnAction(Event -> {
            check_button.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("close.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }

}
