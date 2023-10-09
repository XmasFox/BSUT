import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TransportService extends Remote {
    int calculateTotalPassengers(Transport transport) throws RemoteException;
    int calculateTotalBaggage(Transport transport) throws RemoteException;
}