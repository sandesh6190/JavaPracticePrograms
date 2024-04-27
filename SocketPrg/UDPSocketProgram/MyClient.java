import java.net.*;

import javax.xml.crypto.Data;

public class MyClient {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(); // server bhako bhaye bracket bhitra port number dinu parthyo jaha
                                                      // server le listen garira hunthyo
            // sending message from clients to server .....
            String message = "Hello from Client";
            byte[] b = new byte[1024];
            b = message.getBytes();
            int len = b.length; // bufferko length nikaleko, bufferko length chai propertyko through nikalincha
                                // so ( ) yo brcket use garnu parena
            InetAddress addr = InetAddress.getByName("localhost");
            int port = 1234; // tyahi port halne junma server le listen garirako cha
            DatagramPacket dp = new DatagramPacket(b, len, addr, port);
            ds.send(dp);

            // receiving from server
            byte[] buf = new byte[1024];
            DatagramPacket dp1 = new DatagramPacket(buf, buf.length);

            // receiving server's data
            ds.receive(dp1);

            // processing received data from server
            String message1 = new String(buf);
            System.out.println("Server says: " + message1);
            ds.close();

        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
