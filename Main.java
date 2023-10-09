import java.io.*;

// Абстрактный класс, представляющий транспортное средство
abstract class Transport implements Serializable {
    private String type;
    // конструктор
    public Transport(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    // абстрактный метод для получения численности пассажиров
    public abstract int getPassengerCount();
}

// Класс, представляющий пассажирский поезд
class PassengerTrain extends Transport {
    private int passengerCount;
    private int baggageCount;
    // конструктор
    public PassengerTrain(String type, int passengerCount, int baggageCount) {
        super(type);
        this.passengerCount = passengerCount;
        this.baggageCount = baggageCount;
    }
    // геттер для численности пассажиров
    public int getPassengerCount() {
        return passengerCount;
    }
    // геттер для численности багажа
    public int getBaggageCount() {
        return baggageCount;
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {
        // Создание пассажирского поезда
        PassengerTrain train = new PassengerTrain("Пассажирский поезд", 100, 200);

        // Сериализация объекта в файл
        try {
            FileOutputStream fileOut = new FileOutputStream("train.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(train);
            out.close();
            fileOut.close();
            System.out.println("Объект сериализован и сохранен в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализация объекта из файла
        try {
            FileInputStream fileIn = new FileInputStream("train.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            PassengerTrain deserializedTrain = (PassengerTrain) in.readObject();
            in.close();
            fileIn.close();

            // Подсчет общей численности пассажиров и багажа
            int totalPassengers = deserializedTrain.getPassengerCount();
            int totalBaggage = deserializedTrain.getBaggageCount();
            System.out.println("Общая численность пассажиров: " + totalPassengers);
            System.out.println("Общая численность багажа: " + totalBaggage);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}