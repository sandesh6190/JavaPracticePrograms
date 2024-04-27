import java.rmi.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            Adder stub = (Adder) Naming.lookup("rmi://127.0.0.1:6666/BCAVII");
            int a = stub.add(10, 20);
            System.out.println("The sum is " + a);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
