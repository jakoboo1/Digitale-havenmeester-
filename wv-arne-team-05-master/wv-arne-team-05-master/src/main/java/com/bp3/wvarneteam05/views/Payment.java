package com.bp3.wvarneteam05.views;

import com.bp3.wvarneteam05.Main;
import com.bp3.wvarneteam05.models.Booking;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Payment {

    private Scene paymentScene;

    public Payment(Booking booking) {
        TopBar tb = new TopBar();
        Pane container = new Pane();

        Label lbPrice = new Label("Prijs:");
        lbPrice.relocate(860, 450);

        Label lbSentence = new Label("Volg de instructies op de pinautomaat");
        lbSentence.relocate(560, 520);

        Button btnContinue = new Button("Doorgaan");
        btnContinue.relocate(820, 800);
        btnContinue.setOnAction(e -> {
            Main.setScene(new Completion(booking).getCompletionScene());
        });

        Button btnReturn = new Button("Terug");
        btnReturn.relocate(15,139);
        btnReturn.setOnAction(e -> {
            Main.setScene(new Person(booking).getPersonScene());
        });

        container.getChildren().addAll(tb.getTopBar(), lbPrice, lbSentence, btnContinue, btnReturn);

        paymentScene = new Scene(container, Main.width, Main.height);
        paymentScene.getStylesheets().add(getClass().getResource("/com/bp3/wvarneteam05/stylesheet.css").
                    toExternalForm());
        lbPrice.getStyleClass().add("label-input");
        lbSentence.getStyleClass().add("label-input");
        btnContinue.getStyleClass().add("button-primary");
        btnReturn.getStyleClass().add("button-back");
        container.getStyleClass().add("pane-primary");
    }

    public Scene getPaymentScene() { return paymentScene; }

}