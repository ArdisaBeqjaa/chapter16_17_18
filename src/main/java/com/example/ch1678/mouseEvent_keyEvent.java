
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
        import javafx.scene.input.MouseEvent;
        import javafx.scene.layout.BorderPane;
        import javafx.scene.layout.GridPane;
        import javafx.scene.layout.HBox;
        import javafx.scene.layout.Pane;
        import javafx.scene.paint.Color;
        import javafx.scene.shape.Circle;
        import javafx.scene.text.Text;
        import javafx.stage.Stage;

        import java.io.IOException;

public class mouseEvent_keyEvent extends Application {

    @Override
    public void start(Stage stage) throws IOException {
       Pane pane=new Pane();
       Text txt=new Text(40,40,"A");
       pane.getChildren().add(txt);

//      txt.setOnMouseDragged(new EventHandler<MouseEvent>() {
//          @Override
//          public void handle(MouseEvent mouseEvent) {
//              txt.setX(txt.getX()+5);
//              txt.setY(txt.getY()+5);
//
//          }
//      });
//----------------------------------------------------
//        txt.setOnMouseDragged(
//                e->{
//                    txt.setX(e.getX());
//                    txt.setY(e.getY());
//                }
//        );

        txt.setOnKeyPressed(
                e->{
                    switch (e.getCode()){
                        case DOWN:txt.setY(txt.getY()+10);break;
                        case UP:txt.setY(txt.getY()-10);break;
                        case LEFT:txt.setX(txt.getX()-10);break;
                        case RIGHT:txt.setX(txt.getX()+10);break;
                        default:
                            if(e.getText().length()>0)txt.setText(e.getText());
                    }
                }
        );
      Scene s1=new Scene(pane,300,300);
      stage.setScene(s1);
      stage.show();
        txt.requestFocus();

    }

    public static void main(String[] args) {
        launch();
    }
}