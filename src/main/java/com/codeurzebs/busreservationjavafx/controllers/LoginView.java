package com.codeurzebs.busreservationjavafx.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LoginView {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
