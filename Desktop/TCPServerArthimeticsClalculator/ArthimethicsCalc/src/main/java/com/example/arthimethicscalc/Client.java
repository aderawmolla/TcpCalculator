package com.example.arthimethicscalc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;
import java.nio.Buffer;

public class Client extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("client-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 385, 420);
        stage.setTitle("Server calculator group 2!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) { launch();}
}
