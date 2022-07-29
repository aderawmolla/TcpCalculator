package Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp extends Thread{
    private ServerSocket serverSocket;
    private int PORT;
    public ServerApp(int port){
        this.PORT = port;
    }
    private boolean running = false;

    public void startServer(){
        try {
            serverSocket = new ServerSocket(PORT);
            this.start();
        } catch (IOException e) {
            System.out.println("Socket connection failed");
        }
    }

    public void stopServer(){
        running = false;
        this.interrupt();
    }
    public float bodMas(String[] ReceiveTokenizer){
        float result  = 0.0f;
        for (int i = 0;i< ReceiveTokenizer.length; i++) {

            if(i == 0){
                result = Integer.parseInt(ReceiveTokenizer[i]);
            }
            if(i != ReceiveTokenizer.length - 1) {
                if (ReceiveTokenizer[i].equals("+")) {
                    result += Integer.parseInt(ReceiveTokenizer[i + 1]);
                } else if (ReceiveTokenizer[i].equals("-")) {
                    result -= Integer.parseInt(ReceiveTokenizer[i + 1]);
                } else if (ReceiveTokenizer[i].equals("*")) {
                    result *= Integer.parseInt(ReceiveTokenizer[i + 1]);
                } else if (ReceiveTokenizer[i].equals("/")) {
                    result /= Integer.parseInt(ReceiveTokenizer[i + 1]);
                }
            }

        }

        return result;
    }
    @Override
    public void run(){
        running = true;
        while(running)
        {
            try
            {
                System.out.println("Server running");
                Socket con = serverSocket.accept();
                RequestHandler requestHandler = new RequestHandler(con);
                requestHandler.start();
            } catch (IOException e) {
                System.out.println("IOException from server");
            }
        }
    }

    public static void main(String[] args) {
        int PORT = 20;
         ServerApp server = new ServerApp(PORT);
         server.startServer();
         System.out.println("Server Starts...");
         try{
             Thread.sleep(6000);
         } catch (InterruptedException e) {
             System.out.println("socket Interrupted ");
         }
        server.stopServer();
    }
}
