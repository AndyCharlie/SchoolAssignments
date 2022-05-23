/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_hwk5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import java.util.Random;
/**
 *
 * @author Adeat
 */
public class Deaton_Hwk5 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        final int HEIGHT = 900;
        final int WIDTH = 1600;
        int maxRadius = 50;
        Group group1 = new Group();
        Random rand = new Random();
        Color[] color = new Color[300];
        int[][] position = new int[300][3];
        
        
        
        for (int i = 0; i < position.length; i++) {
            int xPos = rand.nextInt(1551) + 50;
            position[i][0] = xPos;
            int yPos = rand.nextInt(851) + 50;
            position[i][1] = yPos;
            int radius = rand.nextInt(26) + 25;
            position[i][2] = radius;
            color[i] = getRandomColor();
        }
        for (int i = 0; i < 300; i++) {
            Circle circle = new Circle (position[i][0], position[i][1], position[i][2], color[i]);
            group1.getChildren().add(circle);
        }
        
        
        
        
        
        
        Scene scene = new Scene(group1, WIDTH, HEIGHT);
        
        primaryStage.setTitle("Andrew Deaton Homework 5");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Color getRandomColor(){
            Random rand = new Random();
            int red = rand.nextInt(256);
            int blue = rand.nextInt(256);
            int green = rand.nextInt(256);
            Color randomColor = Color.rgb(red, blue, green);
            return randomColor;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
