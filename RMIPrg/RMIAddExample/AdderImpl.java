import java.rmi.*;
import java.rmi.server.*;

public class AdderImpl extends UnicastRemoteObject implements Adder {
    AdderImpl() throws RemoteException {
        super();
    }

    public int add(int x, int y) {
        return x + y;
    }
}
