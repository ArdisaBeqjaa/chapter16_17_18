package com.example.ch1678;

        import javafx.application.Application;

        import javafx.scene.Scene;
        import javafx.scene.layout.Pane;
        import javafx.scene.layout.StackPane;
        import javafx.scene.paint.Color;
        import javafx.scene.shape.Circle;
        import javafx.stage.Stage;

        import java.io.IOException;

public class ex15_7 extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        double w=50;
        double h=50;
        Circle c1=new Circle(w/2,h/2,Math.min(w,h));
        StackPane pane=new StackPane();
        c1.setStroke(Color.VIOLET);
        pane.getChildren().add(c1);
        pane.setOnMousePressed(e->{
            c1.setFill(Color.BLUE);
        });
        pane.setOnMouseReleased(
                e->{
                    c1.setFill(Color.RED);
                }
        );
        Scene s1=new Scene(pane,w,h);
        stage.setScene(s1);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }

}