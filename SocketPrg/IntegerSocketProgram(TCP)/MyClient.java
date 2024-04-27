import java.net.*;
import java.io.*;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        try

        {
            Socket s = new Socket("localhost", 3333);

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

            System.out.println("Enter your number: ");

            Integer num = Integer.parseInt(br.readLine());
            dos.writeInt(num);

            Integer ans = dis.readInt(); // read from server
            System.out.println("The square of number " + num + " is: " + ans);
            dos.close();
            dis.close();
            s.close();

        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
