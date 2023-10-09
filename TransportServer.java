import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class TransportServer {
    public static void main(String[] args) {
        try {
            // Создаем удаленный объект и регистрируем его в RMI Registry
            TransportService transportService = new TransportServiceImpl();
            LocateRegistry.createRegistry(1099); // Порт RMI Registry по умолчанию
            Naming.rebind("TransportService", transportService);

            System.out.println("Сервер запущен.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}