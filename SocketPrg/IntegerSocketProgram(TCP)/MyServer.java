import java.net.*;
import java.io.*;

public class MyServer {

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(3333);
            System.out.println("Server is Listening.....");
            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            Integer number = dis.readInt();
            Integer answer = number * number;

            System.out.println("The question is : " + number);
            // System.out.println("The square of number " + number + " is: " + answer);
            System.out.println("Result Sent");

            dos.writeInt(answer); // send to client
            System.out.println("Connection terminate");
        }

        catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}