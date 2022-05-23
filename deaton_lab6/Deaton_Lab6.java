/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
/**
 *
 * @author Adeat
 */
public class Deaton_Lab6 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Image picKitten = new Image("kittens.jpg", 400, 400, true, true);
        Image picPuppies = new Image("puppies.jpg", 300, 300, true, true);
        Image picStars = new Image("stars.jpg", 200, 200, true, true);
        ImageView viewKitten = new ImageView(picKitten);
        ImageView viewPuppies = new ImageView(picPuppies);
        ImageView viewStars = new ImageView(picStars);
        GridPane gPane = new GridPane();
        gPane.add(viewKitten, 0, 1);
        gPane.add(viewPuppies, 0, 2);
        gPane.add(viewStars, 1, 0);
        Scene scene = new Scene(gPane, 1600, 900);
        primaryStage.setTitle("Andrew Deaton Lab 6");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
