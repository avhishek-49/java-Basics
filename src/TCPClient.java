import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            // Connect to the server on localhost, port 1234
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Connected to server.");

            // Create input and output streams for communication with the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Create a reader to read input from the console
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            // Read messages from the console and send them to the server
            String message;
            while ((message = consoleReader.readLine()) != null) {
                out.println(message);
                System.out.println("Server: " + in.readLine());
            }

            // Close the connection
            consoleReader.close();
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
