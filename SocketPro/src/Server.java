import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {

        System.out.println("Server Started ....");
        ServerSocket serverSocket = new ServerSocket(7856);
        System.out.println("Server is Waiting for Client Request  .... ");
        Socket socket = serverSocket.accept();
        System.out.println("Client Connected ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String str = bufferedReader.readLine();

        System.out.println( "Client Data"+str);

    }
}
