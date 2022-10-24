package com.bp3.wvarneteam05.views;

import com.bp3.wvarneteam05.Main;
import com.bp3.wvarneteam05.controllers.PersonController;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

public class Person {

    private Scene personScene;

    public Person(com.bp3.wvarneteam05.models.Booking booking) {
        PersonController pcontroller = new PersonController();
        TopBar tb = new TopBar();
        Pane container = new Pane();

        Label lbTitle = new Label("Geef hier je persoonsgegevens");
        lbTitle.relocate(680, 180);

        Label lbName = new Label("Naam:");
        lbName.relocate(330,300);

        Label lbAdress = new Label("Adres:");
        lbAdress.relocate(330,400);

        Label lbCity = new Label("Stad:");
        lbCity.relocate(330,500);

        Label lbPhone = new Label("Telefoon:");
        lbPhone.relocate(330,600);

        Label lbEmail = new Label("Email:");
        lbEmail.relocate(330,700);

        Label lbWarning = new Label("");
        lbWarning.relocate(800,780);

        TextField txtName = new TextField("");
        txtName.relocate(560, 300);

        TextField txtAdress = new TextField("");
        txtAdress.relocate(560, 400);

        TextField txtCity = new TextField("");
        txtCity.relocate(560, 500);

        TextField txtPhone = new TextField("");
        txtPhone.relocate(560, 600);

        TextField txtEmail = new TextField("");
        txtEmail.relocate(560, 700);

        CheckBox cbMember = new CheckBox("Lid?");
        cbMember.relocate(740,850);

        Button btnNext = new Button("Doorgaan");
        btnNext.relocate(930,840);
        btnNext.setOnAction(e -> {
            if(!txtName.getText().trim().isEmpty() && !txtAdress.getText().trim().isEmpty() && !txtCity.getText().trim().isEmpty()
                    && !txtPhone.getText().trim().isEmpty() && !txtEmail.getText().trim().isEmpty()) {
                if(!cbMember.isSelected()){
                    booking.setPerson(pcontroller.CreatePerson(txtName.getText(), txtAdress.getText(), txtCity.getText(), txtPhone.getText(), txtEmail.getText()));
                    Main.setScene(new Payment(booking).getPaymentScene());
                }else{
                    booking.setPerson(pcontroller.CreateMember(txtName.getText(), txtAdress.getText(), txtCity.getText(), txtPhone.getText(), txtEmail.getText()));
                    Main.setScene(new Payment(booking).getPaymentScene());
                }
            }else {
                lbWarning.setText("Vul alle velden in");
            }
        });

        Button btnReturn = new Button("Terug");
        btnReturn.relocate(15,139);
        btnReturn.setOnAction(e -> {
            Main.setScene(new Booking(booking, booking.getBerth().getHarbor()).getBookingScene());
        });

        container.getChildren().addAll(tb.getTopBar(), lbTitle, lbName, lbAdress, lbCity, lbPhone, lbEmail, lbWarning, txtName, txtAdress, txtCity, txtPhone,
                                        txtEmail, btnNext, btnReturn, cbMember);

        personScene = new Scene(container, Main.width, Main.height);
        personScene.getStylesheets().add(getClass().getResource("/com/bp3/wvarneteam05/stylesheet.css").
                    toExternalForm());
        lbTitle.getStyleClass().add("label-input");
        lbName.getStyleClass().add("label-input");
        lbAdress.getStyleClass().add("label-input");
        lbCity.getStyleClass().add("label-input");
        lbPhone.getStyleClass().add("label-input");
        lbEmail.getStyleClass().add("label-input");
        lbWarning.getStyleClass().add("label-input");
        lbWarning.setStyle("-fx-font-size: 32px; ");
        txtName.getStyleClass().add("input-primary");
        txtCity.getStyleClass().add("input-primary");
        txtAdress.getStyleClass().add("input-primary");
        txtPhone.getStyleClass().add("input-primary");
        txtEmail.getStyleClass().add("input-primary");
        btnNext.getStyleClass().add("button-primary");
        btnReturn.getStyleClass().add("button-back");
        container.getStyleClass().add("pane-primary");
        cbMember.getStyleClass().add("check-box-primary");
    }

    public Scene getPersonScene() { return personScene; }

}
