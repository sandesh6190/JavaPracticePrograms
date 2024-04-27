import java.rmi.*;

public interface ConcatInterface extends Remote {
    public String concat(String txt1, String txt2) throws RemoteException;
}