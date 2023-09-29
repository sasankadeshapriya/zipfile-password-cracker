package com.credithub.zipfilepasswordcracker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CrackerController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}