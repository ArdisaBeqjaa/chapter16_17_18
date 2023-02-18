package com.example.ch1678;

import javafx.application.Application;



        import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

        import java.io.IOException;

public class ex15_4 extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        HBox hBox =new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Label label=new Label("number 1:");
        TextField textField=new TextField();

        Label label1=new Label("nubmer 2:");
        TextField textField1=new TextField();

        Label label2=new Label("result");
        TextField textField2=new TextField();



        hBox.getChildren().addAll(
                label,textField,
                label1,textField1,
                label2,textField2);

        HBox hBox1=new HBox();
        Button add=new Button("add");
        Button sub=new Button("subtract");
        Button mult=new Button("mult");
        Button divide=new Button("divide");
        hBox1.getChildren().addAll(add,sub,mult,divide);
        hBox1.setSpacing(10);
        hBox1.setAlignment(Pos.CENTER);

        BorderPane borderPane=new BorderPane();
//        borderPane.setTop(hBox);
        borderPane.setBottom(hBox1);
        borderPane.setTop(hBox);

//        annoym
       add.setOnAction(new EventHandler<ActionEvent>()
       {
           @Override
           public void handle(ActionEvent e){
               int x= Integer.parseInt((textField.getText()));
               int y=Integer.parseInt(textField1.getText());
               int sum=x+y;
              textField2.setText(String.valueOf(sum));
           }
       });

       sub.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
               int x=(Integer.parseInt(textField.getText()));
               int y=(Integer.parseInt(textField1.getText()));
               int sum=x-y;
               textField2.setText(String.valueOf(sum));
           }
       });
        Scene s1=new Scene(borderPane);
        stage.setScene(s1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}