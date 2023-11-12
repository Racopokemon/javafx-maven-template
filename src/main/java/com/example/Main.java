package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello there!");
        Button btn = new Button();
        btn.setText("Hi?");
        btn.setOnAction((event) -> {
            System.out.println("Hiii");
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        stage.setScene(new Scene(root, 350, 200));
        stage.show();
        
        //this is how you can access files inside the resources folder: 
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("icon.png")));
    }
}