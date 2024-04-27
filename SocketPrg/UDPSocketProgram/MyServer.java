import java.net.*;

/**
 * MyServer
 */

// datagram packet send huncha ra yo transfer huda sadhei bytearray ko formma
// huna paryo so send garda string lai bytearrayma convert garne ani receive
// garda bytearray formma ako huncha teslai stringma convert garne
// datagram packet transfer through sockets
// client ko address,port chai clientle pathako datagram packetmai aako huncha
public class MyServer {
    public static void main(String[] args) {
        try {
            // creating a socket
            DatagramSocket ds = new DatagramSocket(1234);
            System.out.println("Server is listening...");

            byte[] buf = new byte[65000]; // byte array type nei banauna parcha client bata ako data lai store garna
            DatagramPacket dp = new DatagramPacket(buf, buf.length);

            // receiving clients data
            ds.receive(dp);

            // processing received data from client
            String message = new String(buf); // converting bytearray to string form
            System.out.println("Client says: " + message);

            // reponse message from server
            String response = "Hi! from server";
            int len = response.length();

            InetAddress address = dp.getAddress(); // dp ma chai clientko address ra port huncha
            int port = dp.getPort();
            byte[] b = new byte[1024];
            b = response.getBytes();
            DatagramPacket dp1 = new DatagramPacket(b, len, address, port); // response message send
                                                                            // garda pani string lai
                                                                            // byte mai convert garnu
                                                                            // parcha

            ds.send(dp1); // sending datagramPacket through socket

            ds.close();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

}