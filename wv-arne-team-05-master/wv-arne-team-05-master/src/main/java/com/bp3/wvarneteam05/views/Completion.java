package com.bp3.wvarneteam05.views;

import com.bp3.wvarneteam05.Main;
import com.bp3.wvarneteam05.controllers.BookingController;
import com.bp3.wvarneteam05.models.Berth;
import com.bp3.wvarneteam05.models.Booking;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Completion {

    private Scene completionScene;

    public Completion(Booking booking) {
        BookingController BC = new BookingController();

        TopBar tb = new TopBar();
        Pane container = new Pane();
        Pane paneCompletion = new Pane();

        Label lbSucces = new Label("Betaling succesvol!");
        lbSucces.relocate(760, 250);

        Berth selectedBerth = booking.getBerth();

        String harborName = switch (selectedBerth.getHarbor()) {
            case 1 -> "Voorhaven";
            case 2 -> "Dokhaven";
            case 3 -> "1e Binnenhaven";
            case 4 -> "Pr. Hendrikdok";
            default -> "";
        };

        Label lbLocation = new Label(String.format("Gereserveerde plaats: %s - %d", harborName, selectedBerth.getNumber()));
        lbLocation.relocate(50,20);

        Label lbBegin = new Label(String.format("Begindatum: %s", booking.getStartdate()));
        lbBegin.relocate(50,70);

        Label lbEnd = new Label(String.format("Einddatum: %s", booking.getEnddate()));
        lbEnd.relocate(50,120);

        Label lbRemind = new Label("Vergeet de betaalbevestiging niet!");
        lbRemind.relocate(580, 800);

        Button btnContinue = new Button("Afronden");
        btnContinue.relocate(820, 900);
        btnContinue.setOnAction(e -> {
            Main.setScene(new Home().getHomeScene());
        });

        Button btnReturn = new Button("Terug");
        btnReturn.relocate(15,139);
        btnReturn.setOnAction(e -> {
            Main.setScene(new Payment(booking).getPaymentScene());
        });

        container.getChildren().addAll(tb.getTopBar(), lbSucces, lbRemind, btnContinue, btnReturn, paneCompletion);
        paneCompletion.setPrefSize(1100,400);
        paneCompletion.relocate(400,350);
        paneCompletion.setStyle("-fx-border-style: solid; -fx-border-width: 1; -fx-border-color: #707070; -fx-background-color: #F5F5F5;");
        paneCompletion.getChildren().addAll(lbLocation, lbBegin, lbEnd);

        completionScene = new Scene(container, Main.width, Main.height);
        completionScene.getStylesheets().add(getClass().getResource("/com/bp3/wvarneteam05/stylesheet.css").
                        toExternalForm());
        lbSucces.getStyleClass().add("label-input");
        lbLocation.getStyleClass().add("label-input");
        lbBegin.getStyleClass().add("label-input");
        lbEnd.getStyleClass().add("label-input");
        lbRemind.getStyleClass().add("label-input");
        btnContinue.getStyleClass().add("button-primary");
        btnReturn.getStyleClass().add("button-back");
        container.getStyleClass().add("pane-primary");

        BC.add(booking);
    }

    public Scene getCompletionScene() { return completionScene; }


}
