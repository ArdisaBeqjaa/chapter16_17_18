
package com.example.ch1678;

        import javafx.application.Application;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.geometry.Insets;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.effect.BlurType;
        import javafx.scene.layout.BorderPane;
        import javafx.scene.layout.HBox;
        import javafx.scene.layout.Pane;
        import javafx.scene.paint.Color;
        import javafx.scene.shape.Circle;
        import javafx.scene.text.Text;
        import javafx.stage.Stage;

        import java.io.IOException;

public class Pos_txt extends Application {
    Text txt=new Text(100,200,"programin is fun");

    @Override
    public void start(Stage stage) throws IOException {
         Pane pane=new Pane(txt);

         Button up =new Button("up");
         Button down=new Button("down");
         Button left=new Button("left");
         Button right=new Button("right");

         HBox hBox=new HBox(up,down,right,left);
         hBox.setSpacing(20);
         hBox.setAlignment(Pos.CENTER);

         BorderPane borderPane=new BorderPane();
         borderPane.setCenter(pane);
         borderPane.setBottom(hBox);


//         Annoymus class
        up.setOnAction(new EventHandler<ActionEvent>(){
            @Override
                    public void handle(ActionEvent e){
                    txt.setY(txt.getY()-10);
            }
        });

        down.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                txt.setY(txt.getY()+10);
            }
        });

        right.setOnAction(new EventHandler<ActionEvent>(){
        @Override
                public void handle(ActionEvent e){
              txt.setX(txt.getX()+10);
        }}
        );

//        innerclass

        left.setOnAction(new pos_left());
        Scene s1=new Scene(borderPane,400,350);
        stage.setScene(s1);
        stage.show();
    }
    class pos_left implements  EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            txt.setX(txt.getX()-10);
        }
    }
    public static void main(String[] args) {
        launch();
    }
}