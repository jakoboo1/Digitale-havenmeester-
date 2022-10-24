package com.bp3.wvarneteam05;

import com.bp3.wvarneteam05.models.Booking;
import com.bp3.wvarneteam05.views.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;

public class Main extends Application {

    private static Stage mainStage;
    private static Connection con;
    public static int width = (int) Screen.getPrimary().getBounds().getWidth();
    public static int height = (int) Screen.getPrimary().getBounds().getHeight();

    @Override
    public void start(Stage stage) throws IOException {
        mainStage = stage;
        con = new DB().getCon();

        setScene(new Home().getHomeScene());
        mainStage.setFullScreen(true);
        mainStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        mainStage.setTitle("WV Arne");
        mainStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void setScene(Scene scene) {
        mainStage.setScene(scene);

        //temp fix tot fullscreen werkt
        mainStage.setFullScreen(true);
    }

    public static Connection getCon() {
        return con;
    }
}