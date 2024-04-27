import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {
    public static void main(String[] args) {
        try {
            SquareImpl obj = new SquareImpl();
            // creating registry
            LocateRegistry.createRegistry(1234);
            // bind
            Naming.rebind("rmi://localhost:1234/BCA", obj);
            System.out.println("Server is listening....");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
