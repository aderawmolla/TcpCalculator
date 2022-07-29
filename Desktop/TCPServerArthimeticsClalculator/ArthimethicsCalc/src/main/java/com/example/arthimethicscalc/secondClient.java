//package com.example.arthimethicscalc;
//import java.net.*;
//import java.io.*;
//
//public class secondClient {
//
//        public static void main(String [] args) {
//            String serverName = "localhost";
//            int port = 20;
//            try {
//                System.out.println("Connecting to " + serverName + " on port " + port);
//                Socket client = new Socket(serverName, port);
//
//                System.out.println("Just connected to " + client.getRemoteSocketAddress());
//                OutputStream outToServer = client.getOutputStream();
//                DataOutputStream out = new DataOutputStream(outToServer);
//
//                out.writeUTF("Hello from " + client.getLocalSocketAddress());
//                InputStream inFromServer = client.getInputStream();
//                DataInputStream in = new DataInputStream(inFromServer);
//
//                System.out.println("Server says " + in.readUTF());
//                client.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
package com.example.arthimethicscalc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;
import java.nio.Buffer;

public class secondClient extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("client-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 385, 420);
        stage.setTitle("Server calculator!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) { launch();}
}

