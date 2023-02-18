
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
        import javafx.scene.layout.*;
        import javafx.scene.paint.Color;
        import javafx.scene.shape.Circle;
        import javafx.scene.shape.Rectangle;
        import javafx.scene.text.Text;
        import javafx.stage.Stage;

        import java.io.IOException;

public class Observable extends Application {
    Circle c1=new Circle(60);
    Rectangle r1=new Rectangle(120,120);
    StackPane pane=new StackPane();
    @Override
    public void start(Stage stage) throws IOException {
    c1.setFill(Color.GRAY);
    r1.setFill(Color.WHITE);
    r1.setStroke(Color.BISQUE);
    pane.getChildren().addAll(c1);

    pane.widthProperty().addListener(ov->resize());
    Scene s1=new Scene(pane,140,140);
    stage.setScene(s1);
    stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    private void resize(){
        double length=Math.min(pane.getWidth(),pane.getHeight());
        c1.setRadius(length/2-15);
//        r1.setWidth(length-30);
//        r1.setWidth(length-30);
    }
}