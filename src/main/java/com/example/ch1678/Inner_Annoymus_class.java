package com.example.ch1678;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.BlurType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class Inner_Annoymus_class extends Application {
    Circle c2=new Circle(40);
    @Override
    public void start(Stage stage) throws IOException {
//      inner class if button clicked fill it with a color

        BorderPane pane=new BorderPane();
        c2.setFill(Color.RED);
        Button btn=new Button("fill");
        pane.setTop(c2);
        pane.setBottom(btn);
        Button btn2=new Button("unfill");

        btn.setOnAction(new ChangeColor());

//        ANNYNMUS CLASS
    btn2.setOnAction(new EventHandler<ActionEvent>() {
                         @Override
                         public void handle(ActionEvent e) {
                             c2.setFill(Color.RED);
                         }
                     }
    );
pane.setCenter(btn2);



        Scene s1=new Scene(pane,300,300);
        stage.setScene(s1);
        stage.show();

    }
      class ChangeColor implements EventHandler<ActionEvent>{
        @Override
          public void handle(ActionEvent e){
            c2.setFill(Color.VIOLET);
        }
      }
    public static void main(String[] args) {
        launch();
    }
}