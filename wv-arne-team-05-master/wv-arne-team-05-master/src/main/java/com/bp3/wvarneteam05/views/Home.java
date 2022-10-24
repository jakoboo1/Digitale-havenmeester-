package com.bp3.wvarneteam05.views;

import com.bp3.wvarneteam05.Main;
import com.bp3.wvarneteam05.models.Booking;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Home {

    private Scene homeScene;

    public Home(){
        TopBar tb = new TopBar();
        Pane container = new Pane();

        Label lbTitel = new Label("Welkom bij Watersportvereniging Arne!");
        lbTitel.relocate(600, 200);

        Button btnReserveren = new Button("Reserveren");
        btnReserveren.setOnAction(e -> {
            Booking booking = new Booking();
            Main.setScene(new Measurements(booking).getMeasurementScene());
        });
        btnReserveren.relocate(500,500 );

        Button btnLogin = new Button("Login");
        btnLogin.relocate(0,1000);
        btnLogin.setOnAction(e-> {
            Main.setScene(new Login().getLoginScene());
        });

        Button btnRegulations = new Button("Reglementen");
        btnRegulations.relocate(1610,1000);
        btnRegulations.setOnAction(e-> {
            Main.setScene(new Regulations().getRegulationsScene());
        });

        container.getChildren().addAll(tb.getTopBar(), lbTitel, btnLogin, btnRegulations, btnReserveren);

        homeScene = new Scene(container, Main.width, Main.height);
        homeScene.getStylesheets().add(getClass().getResource("/com/bp3/wvarneteam05/stylesheet.css").toExternalForm());

        //style aan een elementen geven (kleur, lettertype)
        lbTitel.getStyleClass().add("label-input");
        btnReserveren.getStyleClass().add("button-primary");
        btnReserveren.setStyle("-fx-pref-width: 800px");
        container.getStyleClass().add("pane-primary");
        btnRegulations.getStyleClass().add("button-primary");
        btnRegulations.setStyle("-fx-background-radius: 25 0 0 0; -fx-border-radius: 25 0 0 0;");
        btnLogin.getStyleClass().add("button-primary");
        btnLogin.setStyle("-fx-background-radius: 0 25 0 0; -fx-border-radius: 0 25 0 0");



    }

    public Scene getHomeScene() {
        return homeScene;
    }

}
