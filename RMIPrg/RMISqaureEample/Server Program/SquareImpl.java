import java.rmi.*;
import java.rmi.server.*;

public class SquareImpl extends UnicastRemoteObject implements SquareInterface {
    SquareImpl() throws RemoteException {
        super();
    }

    public int square(int x) throws RemoteException {
        return x * x;
    }
}