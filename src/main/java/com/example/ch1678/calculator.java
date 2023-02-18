package com.example.ch1678;

        import javafx.application.Application;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.geometry.Insets;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import javafx.scene.effect.BlurType;
        import javafx.scene.layout.BorderPane;
        import javafx.scene.layout.GridPane;
        import javafx.scene.layout.HBox;
        import javafx.scene.layout.Pane;
        import javafx.scene.paint.Color;
        import javafx.scene.shape.Circle;
        import javafx.scene.text.Text;
        import javafx.stage.Stage;

        import java.io.IOException;

public class calculator extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane=new GridPane();
        Label label1=new Label("annual interest rate:");
        Label label2=new Label("number of years:");
        Label label3=new Label("loan");
        Label label=new Label("monthly panyment");
        Label label4=new Label("total payment");

        gridPane.add(label1,1,1);
        gridPane.add(label2,1,2);
        gridPane.add(label3,1,3);
        gridPane.add(label,1,4);
        gridPane.add(label4,1,5);

        TextField textField=new TextField();
        TextField textField1=new TextField();
        TextField textField2=new TextField();
        TextField textField3=new TextField();
        TextField textField4=new TextField();

        gridPane.add(textField,3,1);
        gridPane.add(textField1,3,2);
        gridPane.add(textField2,3,3);
        gridPane.add(textField3,3,4);
        gridPane.add(textField4,3,5);

        Button btn=new Button("calculate");
        gridPane.add(btn,3,6);
        btn.setAlignment(Pos.CENTER_RIGHT);
        HBox hbox=new HBox();

        gridPane.setVgap(20);
        gridPane.setHgap(9);

        btn.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public  void handle(ActionEvent e){
              int x= Integer.parseInt(textField1.getText());
              int y=Integer.parseInt(textField2.getText());
              int sum =x+y;
              textField4.setText(String.valueOf(sum));
            }

        });

         Scene s1=new Scene(gridPane,300,300);
        stage.setScene(s1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}