package com.example.ch1678;

        import javafx.application.Application;

        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.geometry.Insets;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.layout.BorderPane;
        import javafx.scene.layout.HBox;
        import javafx.scene.layout.Pane;
        import javafx.scene.paint.Color;
        import javafx.scene.shape.Circle;
        import javafx.stage.Stage;

        import java.io.IOException;

public class ex15_3 extends Application {
      Pane pane =new Pane();
      Circle c1=new Circle(40);
    @Override
    public void start(Stage stage) throws IOException {
     c1.setFill(Color.BISQUE);
     c1.setCenterY(100);
     c1.setCenterX(200);
     pane.getChildren().add(c1);


        HBox hBox=new HBox();
        Button left=new Button("left");
        Button right=new Button("right");
        Button up=new Button("up");
        Button down=new Button("down");
        hBox.getChildren().addAll(left,right,up,down);
        hBox.setPadding(new Insets(40));
        hBox.setSpacing(10);

        BorderPane borderPane=new BorderPane();
        borderPane.setTop(pane);
        borderPane.setBottom(hBox);
        //using lambda expression
      left.setOnAction(
              e->{
                  c1.setCenterX(c1.getCenterX()-10);
              }
      );

      //using inner class
      right.setOnAction(new shift());


//  -----ANONYMUSS CLASSS----------------
        up.setOnAction(new EventHandler<ActionEvent>() {
            @Override
                          public  void handle(ActionEvent e){
                              c1.setCenterY(c1.getCenterY()-10);
                          }
                          }
        );

        down.setOnAction(new EventHandler<ActionEvent>() {
                           @Override
                           public  void handle(ActionEvent e){
                               c1.setCenterY(c1.getCenterY()+10);
                           }
                       }
        );
//  --------------------------------------------
      Scene s1=new Scene(borderPane,300,300);
        stage.setScene(s1);
        stage.show();


    }
    class shift implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            c1.setCenterX(c1.getCenterX() + 10);
        }
    }






        public static void main(String[] args) {
            launch();
        }

}