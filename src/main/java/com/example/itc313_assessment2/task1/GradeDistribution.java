package com.example.itc313_assessment2.task1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GradeDistribution extends Application {
    // Grade variables
    private static final int HD = 15, DI = 20, CR = 25, PS = 35, FL = 5;

    // Pane variables
    private static final double SIZE = 200.0;
    private static final double RADIUS = SIZE / 2.0;

    @Override
    public void start(Stage primaryStage) {

        // Create pie slices

        // HD
        double startAngle = 0;
        Arc arcHD = new Arc(RADIUS, RADIUS, RADIUS, RADIUS, startAngle, 360 * (HD / 100.0));
        arcHD.setFill(Color.GREEN);
        arcHD.setType(ArcType.ROUND);

        // DI
        startAngle += 360 * (HD / 100.0);
        Arc arcDI = new Arc(RADIUS, RADIUS, RADIUS, RADIUS, startAngle, 360 * (DI / 100.0));
        arcDI.setFill(Color.DARKBLUE);
        arcDI.setType(ArcType.ROUND);

        // CR
        startAngle += 360 * (DI / 100.0);
        Arc arcCR = new Arc(RADIUS, RADIUS, RADIUS, RADIUS, startAngle, 360 * (CR / 100.0));
        arcCR.setFill(Color.CYAN);
        arcCR.setType(ArcType.ROUND);

        // PS
        startAngle += 360 * (CR / 100.0);
        Arc arcPS = new Arc(RADIUS, RADIUS, RADIUS, RADIUS, startAngle, 360 * (PS / 100.0));
        arcPS.setFill(Color.GOLDENROD);
        arcPS.setType(ArcType.ROUND);

        // FL
        startAngle += 360 * (PS / 100.0);
        Arc arcFL = new Arc(RADIUS, RADIUS, RADIUS, RADIUS, startAngle, 360 * (FL / 100.0));
        arcFL.setFill(Color.RED);
        arcFL.setType(ArcType.ROUND);

        // Create text labels
        Text textHD = new Text("HD = " + HD + "%");
        textHD.setX(RADIUS + 30);
        textHD.setY(RADIUS - 20);

        Text textDI = new Text("DI = " + DI + "%");
        textDI.setX(RADIUS - 20);
        textDI.setY(RADIUS - 80);

        Text textCR = new Text("CR = " + CR + "%");
        textCR.setX(RADIUS - 90);
        textCR.setY(RADIUS);

        Text textPS = new Text("PS = " + PS + "%");
        textPS.setX(RADIUS + 5);
        textPS.setY(RADIUS + 70);

        Text textFL = new Text("FL = " + FL + "%");
        textFL.setX(RADIUS + 40);
        textFL.setY(RADIUS + 12);


        Pane pie = new Pane();
        pie.getChildren().addAll(arcHD, arcDI, arcCR, arcPS, arcFL, textHD, textDI, textCR, textPS, textFL);

        StackPane pane = new StackPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10, 100, 10, 100));
        pane.getChildren().add(pie);

        // Create a scene and place it on the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Grade Distribution");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
