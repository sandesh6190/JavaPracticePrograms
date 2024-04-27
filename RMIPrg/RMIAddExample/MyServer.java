import java.rmi.*;
import java.rmi.registry.LocateRegistry;;

public class MyServer {
    public static void main(String[] args)
    {
        try{
            AdderImpl stub=new AdderImpl();
            LocateRegistry.createRegistry(6666);
            Naming.rebind("rmi://127.0.0.1:6666/BCAVII",stub);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
