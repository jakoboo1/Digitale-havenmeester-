package com.bp3.wvarneteam05.views;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class TopBar {
    private BorderPane topBar;

    public TopBar() {
        buildScene();
    }

    public Pane getTopBar() {
        return topBar;
    }

    private void buildScene() {
        topBar = new BorderPane();
        topBar.setPrefSize(1920, 120);
        topBar.setStyle("-fx-border-style: solid; -fx-border-width: 1; -fx-border-color: #707070; -fx-background-color: #FFFFFF;");
        Pane lbPane = new Pane();
        Label lbWVArne = new Label("WV Arne");
        lbWVArne.setStyle("-fx-font-size: 32px; -fx-text-fill: #000000;");
        lbWVArne.setPrefSize(500, 50);
        lbPane.getChildren().addAll(lbWVArne);
        topBar.setCenter(lbPane);

        Pane imgPane = new Pane();
        imgPane.setStyle("-fx-border-style: solid; -fx-border-width: 1; -fx-border-color: #707070; -fx-background-color: #FFFFFF;");
        String logo = this.getClass().getResource("/com/bp3/wvarneteam05/imgs/logo.png").toExternalForm();
        Image photoLogo = new Image(logo);
        ImageView imgLogo = new ImageView(photoLogo);
        imgLogo.setFitWidth(181);
        imgLogo.setFitHeight(118);
        imgPane.getChildren().add(imgLogo);
        topBar.setLeft(imgPane);

        ComboBox<String> cbLanguages = new ComboBox<>();
        cbLanguages.getItems().addAll("Nederlands", "English", "Deutsch");
        cbLanguages.setStyle("-fx-border-style: none none none solid; -fx-border-width: 1; -fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-font-size: 22;");
        cbLanguages.setPrefSize(267, 120);
        topBar.setRight(cbLanguages);

        lbWVArne.relocate((topBar.getPrefWidth() - imgPane.getPrefWidth())/ 2 - lbWVArne.getPrefWidth() / 2, topBar.getPrefHeight() / 2 - lbWVArne.getPrefHeight() / 2);
    }
}
