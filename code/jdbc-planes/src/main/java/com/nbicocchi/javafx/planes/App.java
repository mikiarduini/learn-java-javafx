package com.nbicocchi.javafx.planes;

import com.nbicocchi.javafx.planes.util.UtilsDB;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("planes-view.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Planes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showLogin(Stage primaryStage) throws IOException {

        /*
        LoginDialog loginDialog = new LoginDialog(primaryStage);
        Optional<Pair<String, String>> result = loginDialog.showAndWait();
        result.ifPresentOrElse(credentials -> {
            Validator validator = new ValidatorDatabase();
            validator.connect();
            if (!validator.checkCredentials(credentials.getKey(), credentials.getValue())) {
                Alert a = new Alert(Alert.AlertType.WARNING, "Login Failed");
                a.setHeaderText("Login failed");
                a.setContentText("Username and/or password not valid");
                a.showAndWait();
                Platform.exit();
            }
        }, Platform::exit);

         */
    }
}
