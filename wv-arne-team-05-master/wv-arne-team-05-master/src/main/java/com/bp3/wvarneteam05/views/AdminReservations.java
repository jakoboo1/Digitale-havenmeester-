package com.bp3.wvarneteam05.views;

import com.bp3.wvarneteam05.Main;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class AdminReservations {

    private Scene adminReservationsScene;

    public AdminReservations(){
        TopBar tb = new TopBar();
        Pane container = new Pane();

        Label lbReservations = new Label("Reserveringen");
        lbReservations.relocate(810,200);

        Button btnReturn = new Button("Uitloggen");
        btnReturn.relocate(15,139);
        btnReturn.setOnAction(e -> {
            Main.setScene(new Login().getLoginScene());
        });

        container.getChildren().addAll(tb.getTopBar(), btnReturn, lbReservations);

        adminReservationsScene = new Scene(container, Main.width, Main.height);
        adminReservationsScene.getStylesheets().add(getClass().getResource("/com/bp3/wvarneteam05/stylesheet.css").
                                toExternalForm());
        btnReturn.getStyleClass().add("button-back");
        container.getStyleClass().add("pane-primary");
        lbReservations.getStyleClass().add("label-input");

    }
    public Scene getAdminReservationsScene() { return adminReservationsScene; }
}
