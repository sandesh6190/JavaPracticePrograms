import java.net.*;
import java.io.*;

class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3333);
            System.out.println("Server is Listening....");
            Socket s = ss.accept(); // accepting client connection

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            String str1 = dis.readUTF(); // data retrive
            System.out.println("Client says: " + str1);

            System.out.println("Enter the message: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // getting input through keyboard
            String str2 = br.readLine(); // till the enter input

            dos.writeUTF(str2); // send to client
            System.out.println("Connection terminate");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}