package com.bp3.wvarneteam05.views;

import com.bp3.wvarneteam05.Main;
import com.bp3.wvarneteam05.controllers.BerthController;
import com.bp3.wvarneteam05.models.Berth;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Booking {
    private Scene bookingScene;

    public Booking(com.bp3.wvarneteam05.models.Booking booking, int harborId) {
        BerthController BC = new BerthController();

        Pane container = new Pane();
        container.getStyleClass().add("pane-primary");

        Pane dpPane = new Pane();
        dpPane.setStyle("-fx-border-style: solid; -fx-border-width: 1; -fx-border-color: #707070; -fx-background-color: #F5F5F5;");
        dpPane.relocate(0, 119);
        dpPane.setPrefSize(1920, 120);

        Button btnReturn = new Button("Terug");
        btnReturn.getStyleClass().add("button-back");
        btnReturn.relocate(15,28);
        btnReturn.setOnAction(e -> {
            Main.setScene(new Harbor(booking).getHarborScene());
        });

        Label lbStartdate = new Label("Reserveren vanaf: Vandaag");
        lbStartdate.getStyleClass().add("label-input");
        lbStartdate.relocate(200, 32);

        Label lbEnddate = new Label("tot:");
        lbEnddate.getStyleClass().add("label-input");
        lbEnddate.relocate(834, 32);

        DatePicker dpEnddate = new DatePicker();
        dpEnddate.setDayCellFactory(picker -> new DateCell() {
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                LocalDate today = LocalDate.now();

                setDisable(empty || date.compareTo(today) < 0 || ChronoUnit.DAYS.between(today, date) > 30);
            }
        });
        dpEnddate.relocate(944, 28);
        dpEnddate.setPrefSize(351, 56);
        dpEnddate.setStyle("-fx-font-size: 32px;");

        dpPane.getChildren().addAll(btnReturn, lbStartdate, lbEnddate, dpEnddate);

        TopBar tb = new TopBar();

        ScrollPane scroll = new ScrollPane();
        Pane pane = new Pane();
        GridPane gpBerths = new GridPane();
        gpBerths.relocate(85, 50);
        gpBerths.getStyleClass().add("pane-primary");

        pane.getChildren().add(gpBerths);

        dpEnddate.valueProperty().addListener((dp, oldValue, newValue) -> {
            gpBerths.getChildren().clear();
            try {
                ResultSet berths = BC.getAvailableBerths(Date.valueOf(newValue), harborId);

                int col = 0;
                int row = 0;

                while(berths.next()) {
                    int berthnumber = berths.getInt("berthnumber");
                    if (col % 4 == 0) {
                        row++;
                        col = 0;
                    }

                    Pane paneButton = new Pane();
                    paneButton.setPrefSize(452, 263);
                    Button btnPlaats = new Button(String.format("Plaats %d", berthnumber));
                    btnPlaats.setId(String.format("berth_%d", berthnumber));

                    btnPlaats.setOnAction(e -> {
                        try {
                            int selectedBerthnumber = Integer.parseInt(btnPlaats.getId().split("_")[1]);
                            ResultSet rs = BC.get(selectedBerthnumber, harborId);
                            if (rs.next()) {
                                booking.setStartdate(LocalDate.now());
                                booking.setEnddate(dpEnddate.getValue());
                                booking.setBerth(new Berth(rs.getDouble("length"), rs.getDouble("width"), rs.getInt("berthnumber"), rs.getInt("harborid"), true));
                                Person person = new Person(booking);
                                Main.setScene(person.getPersonScene());
                            } else {
                                new Alert(Alert.AlertType.ERROR, "Er is iets misgegaan met het ophalen van de ligplaats");
                            }
                        } catch (SQLException sqlEx) {
                            sqlEx.printStackTrace();
                        }
                    });

                    btnPlaats.getStyleClass().add("button-berth");
                    btnPlaats.setPrefSize(373, 228);

                    paneButton.getChildren().add(btnPlaats);
                    gpBerths.add(paneButton, col, row);

                    col++;
                }
            } catch (SQLException sqlEx) {
                new Alert(Alert.AlertType.ERROR, "Er is iets misgegaan met het ophalen van de data.").show();
                sqlEx.printStackTrace();
            }
        });

        LocalDate selectedEnddate = booking.getEnddate();
        if(selectedEnddate != null)
            dpEnddate.setValue(selectedEnddate);

        scroll.setStyle("-fx-background: #FFFFFF;");
        scroll.setContent(pane);
        scroll.relocate(0, 239);
        scroll.setPrefSize(1920, 841);

        container.getChildren().addAll(tb.getTopBar(), dpPane, scroll);

        bookingScene = new Scene(container, Main.width, Main.height);
        bookingScene.getStylesheets().add(getClass().getResource("/com/bp3/wvarneteam05/stylesheet.css").toExternalForm());
    }

    public Scene getBookingScene() { return bookingScene; }
}
