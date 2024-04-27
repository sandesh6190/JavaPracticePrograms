import java.rmi.*;

public interface SquareInterface extends Remote {
    public int square(int x) throws RemoteException;
}