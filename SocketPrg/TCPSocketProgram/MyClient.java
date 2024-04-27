import java.net.*;
import java.io.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 3333); // same porrtnumber where the server is listening
            DataOutputStream dos = new DataOutputStream((s.getOutputStream()));
            DataInputStream dis = new DataInputStream(s.getInputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
            System.out.println("Enter your message");

            String str = "";
            String message = "";
            while (true) {
                str = br.readLine();
                if (str.equals("stop")) {
                    break;
                }
                message = message + " " + str;
            }
            dos.writeUTF(message); // writeINT for integer , sending to server
            String str1 = dis.readUTF(); // read from server
            System.out.println("Server says: " + str1);
            dos.close();
            dis.close();
            s.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
