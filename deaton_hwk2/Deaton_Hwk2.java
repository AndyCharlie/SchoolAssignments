/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_hwk2;

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
public class Deaton_Hwk2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        final int WIDTH = 1600;
        final int HEIGHT = 900;
        
        
        GetRandomValues a = new GetRandomValues(20, 200, 20, 400, "RED");
        Text txta = new Text(5 ,15 , a.toString());
        Rectangle reca = new Rectangle(5, 75, a.getWidth(), a.getHeight());
        reca.setFill(a.getNewColor());
        
        GetRandomValues b = new GetRandomValues(20, 200, 20, 400, "BLUE");
        Text txtb = new Text(405 ,15 ,b.toString());
        Rectangle recb = new Rectangle(405 , 75, b.getWidth(), b.getHeight());
        recb.setFill(b.getNewColor());
        
        GetRandomValues c = new GetRandomValues(20, 200, 20, 400, "whoops");
        Text txtc = new Text(805 ,15 ,c.toString());
        Rectangle recc = new Rectangle(805 , 75, c.getWidth(), c.getHeight());
        recc.setFill(c.getNewColor());
        
        Group setA = new Group(txta, reca);
        Group setB = new Group(txtb, recb);
        Group setC = new Group(txtc, recc);
        
        Group full = new Group(setA, setB, setC);
        
        Scene aScene = new Scene(full, WIDTH, HEIGHT);
        primaryStage.setScene(aScene);
        
        primaryStage.setTitle("Andrew Deaton Homework 2");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
