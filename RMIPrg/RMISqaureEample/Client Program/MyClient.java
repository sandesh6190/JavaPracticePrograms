import java.rmi.*;
import java.util.*; //scannerko thorugh userbata data lina

public class MyClient {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            System.out.println("Enter the number: ");
            int num = obj.nextInt();
            SquareInterface stub = (SquareInterface) Naming.lookup("rmi://localhost:1234/BCA");
            int result = stub.square(num);
            System.out.println("Sqaure of a number is : " + result);
        } catch (Exception e) {
            System.out.println("Exception Caught: " + e.getLocalizedMessage());
        }
    }
}
