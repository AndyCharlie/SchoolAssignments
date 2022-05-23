/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrewdeaton_homework2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
/**
 *
 * @author Adeat
 */
public class AndrewDeaton_Homework2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        final int WIDTH = 700;
        final int HEIGHT = 400;
        
        Text txtName = new Text(10, 20, "Andrew Deaton messing with JavaFX");
        Circle a = new Circle(350, 200, 75);
        Rectangle b = new Rectangle(50, 75, 50,150);
        a.setFill(Color.LIGHTGREEN);
        b.setFill(Color.DEEPSKYBLUE);
        txtName.setFill(Color.MIDNIGHTBLUE);
        Group brNode = new Group(txtName, a, b);
        Scene aScene = new Scene(brNode, WIDTH, HEIGHT);
        primaryStage.setScene(aScene);
        primaryStage.setTitle("Hello Dots and Boxes!");
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
