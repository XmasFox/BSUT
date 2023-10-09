import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TransportServiceImpl extends UnicastRemoteObject implements TransportService {
    public TransportServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public int calculateTotalPassengers(Transport transport) throws RemoteException {
        return transport.getPassengerCount();
    }

    @Override
    public int calculateTotalBaggage(Transport transport) throws RemoteException {
        return transport.getBaggageCount();
    }
}