import java.rmi.*;
import java.util.*;

public class MyClient {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            System.out.println("Enter First String: ");
            String str1 = obj.nextLine();

            System.out.println("Enter Seconf String: ");
            String str2 = obj.nextLine();

            ConcatInterface stub = (ConcatInterface) Naming.lookup("rmi://192.168.8.85:6666/BCA");

            String fullStr = stub.concat(str1, str2);
            System.out.println("Concatinated String: " + fullStr);
        } catch (Exception e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
