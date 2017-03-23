package com.perepelitsya;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.util.logging.Logger;

public class Main extends Application {

    static Logger logger = Logger.getLogger(String.valueOf(Main.class));
//to add 4 logger
    @Override
    public void start(Stage primaryStage) throws Exception {
        Image icon = new Image("32.png");
        primaryStage.getIcons().add(icon);
        logger.info("My own icon");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        primaryStage.setTitle("BoolCalc");
        logger.info("Set Title   ----- BoolCalc!");
        primaryStage.setScene(new Scene(root));
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("Welcome! Dear User!");
        logger.info("FullScreen is true");
        primaryStage.show();
        logger.info("App Started");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
