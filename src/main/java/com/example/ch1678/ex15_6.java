package com.example.ch1678;

        import javafx.application.Application;

        import javafx.geometry.Insets;
        import javafx.scene.Scene;
        import javafx.scene.layout.Pane;
        import javafx.scene.text.Font;
        import javafx.scene.text.Text;
        import javafx.stage.Stage;

        import java.io.IOException;

public class ex15_6 extends Application {

    @Override
    public void start(Stage stage) throws IOException {
//    if we click with mouse the text will change
//        ne nk e bejm tek buttonat
//        per txt perdorim pane te thjesht
        Pane pane=new Pane();
        Text txt=new Text("Welcome to java");
        txt.setX(20);
        txt.setY(50);
        txt.setFont(Font.font("Times New Roman",40));
        pane.getChildren().add(txt);
        pane.setPadding(new Insets(50));
        txt.setOnMouseClicked(
                e->{
                    txt.setText("learn java fx");

                }
        );
        Scene s1=new Scene(pane);
        stage.setScene(s1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}