import java.rmi.Naming;

public class TransportClient {
    public static void main(String[] args) {
        try {
            // Получаем удаленный объект из RMI Registry
            TransportService transportService = (TransportService) Naming.lookup("rmi://localhost/TransportService");

            // Создаем объект PassengerTrain
            PassengerTrain train = new PassengerTrain("Пассажирский поезд", 100, 200);

            // Вызываем удаленные методы
            int totalPassengers = transportService.calculateTotalPassengers(train);
            int totalBaggage = transportService.calculateTotalBaggage(train);

            System.out.println("Общая численность пассажиров: " + totalPassengers);
            System.out.println("Общая численность багажа: " + totalBaggage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}