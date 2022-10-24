package com.bp3.wvarneteam05.views;

import com.bp3.wvarneteam05.Main;
import com.bp3.wvarneteam05.controllers.BoatController;
import com.bp3.wvarneteam05.models.Booking;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Measurements {

    private Scene measurementScene;

    public Measurements(Booking booking){
        BoatController Boatc = new BoatController();
        TopBar tb = new TopBar();
        Pane container = new Pane();

        Label lbTitel = new Label("Geef hier je bootafmeting");
        lbTitel.relocate(680, 200);

        Label lbLengte = new Label("Lengte:");
        lbLengte.relocate(330,330);

        Label lbBreedte = new Label("Breedte:");
        lbBreedte.relocate(330, 430);

        Label lbHoogte = new Label("Hoogte:");
        lbHoogte.relocate(330, 530);

        Label lbDiepte = new Label("Diepte:");
        lbDiepte.relocate(330,  630);

        TextField tfLengte = new TextField();
        tfLengte.relocate(560, 330);

        TextField tfBreedte = new TextField();
        tfBreedte.relocate(560, 430);

        TextField tfHoogte = new TextField();
        tfHoogte.relocate(560, 530);

        TextField tfDiepte = new TextField();
        tfDiepte.relocate(560, 630);

        CheckBox cbBoot = new CheckBox("Meerrompschip?");
        cbBoot.relocate(740,850 );

        Button btnDoorgaan = new Button("Doorgaan");
        btnDoorgaan.relocate(930, 840);
        btnDoorgaan.setOnAction(e -> {
            Main.setScene(new Harbor(booking).getHarborScene());
        });

        Button btnAfbreken = new Button("Afbreken");
        btnAfbreken.relocate(15,139);
        btnAfbreken.setOnAction(e -> {
            Main.setScene(new Home().getHomeScene());
        });

        container.getChildren().addAll(tb.getTopBar(), lbTitel, lbLengte, lbBreedte, lbHoogte, lbDiepte,
                tfLengte, tfBreedte, tfHoogte, tfDiepte, cbBoot, btnDoorgaan, btnAfbreken);
        measurementScene = new Scene(container, Main.width, Main.height);
        measurementScene.getStylesheets().add(getClass().getResource("/com/bp3/wvarneteam05/stylesheet.css").toExternalForm());

        lbTitel.getStyleClass().add("label-input");
        lbLengte.getStyleClass().add("label-input");
        lbBreedte.getStyleClass().add("label-input");
        lbHoogte.getStyleClass().add("label-input");
        lbDiepte.getStyleClass().add("label-input");
        tfLengte.getStyleClass().add("input-primary");
        tfBreedte.getStyleClass().add("input-primary");
        tfHoogte.getStyleClass().add("input-primary");
        tfDiepte.getStyleClass().add("input-primary");
        btnDoorgaan.getStyleClass().add("button-primary");
        btnAfbreken.getStyleClass().add("button-back");
        container.getStyleClass().add("pane-primary");
    }

    public Scene getMeasurementScene() {
        return measurementScene;
    }
}
