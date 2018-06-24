import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception {

        String ip = "localhost";
        int port = 7856;
        Socket socket = new Socket(ip,port);

        String str = "Akitha Manujaya";

        //Send data by output port of the socket by Stream
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
        PrintWriter out = new PrintWriter(outputStreamWriter);
        outputStreamWriter.write(str);
//        outputStreamWriter.flush();

    }
}
