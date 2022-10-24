package com.bp3.wvarneteam05.views;

import com.bp3.wvarneteam05.Main;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Harbor {

    private Scene harborScene;

    public Harbor(com.bp3.wvarneteam05.models.Booking booking) {
        TopBar tb = new TopBar();
        Pane container = new Pane();

        Label lbTitel = new Label("Kies de gewenste haven");
        lbTitel.relocate(680, 200);

        Button btnVoorhaven = new Button("Voorhaven");
        btnVoorhaven.relocate(1180, 350);
        btnVoorhaven.setOnAction(e -> {
            Main.setScene(new Booking(booking, 1).getBookingScene());
        });

        Button btnDokhaven = new Button("Dokhaven");
        btnDokhaven.relocate(1180, 450);
        btnDokhaven.setOnAction(e -> {
            Main.setScene(new Booking(booking, 2).getBookingScene());
        });

        Button btnBinnenhaven = new Button("1e Binnenhaven");
        btnBinnenhaven.relocate(1180, 550);
        btnBinnenhaven.setOnAction(e -> {
            Main.setScene(new Booking(booking, 3).getBookingScene());
        });

        Button btnHendrikdok = new Button("Pr. Hendrikdok");
        btnHendrikdok.relocate(1180, 650);
        btnHendrikdok.setOnAction(e -> {
            Main.setScene(new Booking(booking, 4).getBookingScene());
        });

        Button btnTerug = new Button("Terug");
        btnTerug.relocate(15, 139);
        btnTerug.setOnAction(e -> {
            Main.setScene(new Measurements(booking).getMeasurementScene());
        });

        String logo = this.getClass().getResource("/com/bp3/wvarneteam05/imgs/Hvn_Middelburg.jpeg").toExternalForm();
        Image photoLogo = new Image(logo);
        ImageView imgLogo = new ImageView(photoLogo);
        imgLogo.setFitWidth(896);
        imgLogo.setFitHeight(502);
        container.getChildren().add(imgLogo);
        imgLogo.relocate(200,320);

        container.getChildren().addAll(tb.getTopBar(), lbTitel, btnVoorhaven, btnDokhaven, btnBinnenhaven, btnHendrikdok, btnTerug);

        harborScene = new Scene(container, Main.width, Main.height);
        harborScene.getStylesheets().add(getClass().getResource("/com/bp3/wvarneteam05/stylesheet.css").toExternalForm());

        lbTitel.getStyleClass().add("label-input");
        btnVoorhaven.getStyleClass().add("button-primary");
        btnDokhaven.getStyleClass().add("button-primary");
        btnBinnenhaven.getStyleClass().add("button-primary");
        btnHendrikdok.getStyleClass().add("button-primary");
        btnTerug.getStyleClass().add("button-back");
        container.getStyleClass().add("pane-primary");
    }

    public Scene getHarborScene() { return harborScene; }
}
