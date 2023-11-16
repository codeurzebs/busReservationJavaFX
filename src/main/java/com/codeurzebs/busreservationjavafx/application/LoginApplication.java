package com.codeurzebs.busreservationjavafx.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("/com/codeurzebs/busreservationjavafx/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("LOGIN ADMINISTRATOR");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
