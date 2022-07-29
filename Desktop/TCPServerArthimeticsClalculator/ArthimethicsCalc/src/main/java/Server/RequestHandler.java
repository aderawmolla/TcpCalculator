package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class RequestHandler extends Thread{
    private Socket socket;
    public RequestHandler(Socket con) {
        this.socket = con;
    }
    @Override
    public void run(){
        try{
            System.out.println("New client connected");
            BufferedReader ConnectionIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            //receive from the client calculator
            String Send = "", Receive = "";
            float result = 0.0f;
            do
            {
                    Receive = ConnectionIn.readLine();
                    System.out.println("Client Message " + Receive);
                if(Receive ==null)
                {
                    System.out.print("Receiving is null");}
                else{
                    //toknize the received message to operation
                    String[] ReceiveTokenizer = Receive.split(" ");
                            ServerApp serverApp = new ServerApp(20);
                            result = serverApp.bodMas(ReceiveTokenizer);
                            if(Receive.equals("stop")) break;
                            Send = String.valueOf(result);
                            System.out.println("Server Ans: " + Send);
                            out.println(Send);
                }
            }while (true);
            ConnectionIn.close();
            out.close();
            socket.close();
            System.out.println("Connection closed!");
        } catch (IOException ex) {
            System.out.println("Socket connection interrupted");
        }
    }
}
