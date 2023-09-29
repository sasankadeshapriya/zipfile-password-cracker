package com.credithub.zipfilepasswordcracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import javafx.scene.image.Image;
import java.io.IOException;

public class PasswordCracker extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PasswordCracker.class.getResource("password-cracker.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Image icon = new Image("file:/F:\\zipfile-password-cracker\\zipfile-password-cracker\\src\\main\\resources\\com\\credithub\\zipfilepasswordcracker\\assets\\icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("CreditHub ZipCracker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}