package com.bp3.wvarneteam05.views;

import com.bp3.wvarneteam05.Main;
import com.bp3.wvarneteam05.controllers.AdminController;
import com.bp3.wvarneteam05.models.Admin;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Login {

    private Scene loginScene;

    public Login(){
        AdminController ac = new AdminController();
        TopBar tb = new TopBar();
        Pane container = new Pane();
        Pane paneLogin = new Pane();

        Label lbUser = new Label("Gebruikersnaam:");
        lbUser.relocate(100,50);

        Label lbPassword = new Label("Wachtwoord:");
        lbPassword.relocate(165,150);

        TextField txtUser = new TextField("");
        txtUser.relocate(460,50);

        TextField txtPassword = new TextField("");
        txtPassword.relocate(460, 150);

        Button btnContineu = new Button("Inloggen");
        btnContineu.relocate(570,280);
        btnContineu.setOnAction(e-> {
            Admin a = new Admin(null,
                    null,
                    null,
                    null,
                    null,
                    txtUser.getText(),
                    txtPassword.getText());
            ac.save(a);
            if(ac.logIn() == true){
                Main.setScene(new AdminReservations().getAdminReservationsScene());
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Verkeerde gebruikersnaam en/of wachtwoord");
                alert.showAndWait();
            }
        });

        Button btnReturn = new Button("Terug");
        btnReturn.relocate(15,139);
        btnReturn.setOnAction(e -> {
            Main.setScene(new Home().getHomeScene());
        });

        container.getChildren().addAll(tb.getTopBar(), btnReturn, paneLogin);
        paneLogin.setPrefSize(1400,400);
        paneLogin.relocate(250,350);
        paneLogin.setStyle("-fx-border-style: solid; -fx-border-width: 1; -fx-border-color: #707070; -fx-background-color: #F5F5F5;");
        paneLogin.getChildren().addAll(lbUser, lbPassword, txtUser, txtPassword, btnContineu);

        loginScene = new Scene(container, Main.width, Main.height);
        loginScene.getStylesheets().add(getClass().getResource("/com/bp3/wvarneteam05/stylesheet.css").
                toExternalForm());
        btnReturn.getStyleClass().add("button-back");
        lbUser.getStyleClass().add("label-input");
        lbPassword.getStyleClass().add("label-input");
        txtUser.getStyleClass().add("input-primary");
        txtPassword.getStyleClass().add("input-primary");
        btnContineu.getStyleClass().add("button-primary");
        container.getStyleClass().add("pane-primary");
    }
    public Scene getLoginScene() { return loginScene; }
}
