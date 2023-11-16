package com.codeurzebs.busreservationjavafx.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField errorUsername;
    @FXML
    private TextField errorPassWord;
    @FXML
    private Button loginButton;

    // Vous pouvez ajouter d'autres éléments ici en fonction de vos besoins.

    @FXML
    private void initialize() {

    }

    @FXML
    private void handleLoginButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() && !password.isEmpty()) {
            errorUsername.setText("**");
        } else {
            errorUsername.setText("");
        }
        if (password.isEmpty() && !username.isEmpty()) {
            errorPassWord.setText("**");
        } else {
            errorPassWord.setText("");
        }
        if (username.isEmpty() && password.isEmpty()) {
            errorUsername.setText("*");
            errorPassWord.setText("*");
        }

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}

