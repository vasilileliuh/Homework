import java.io.File;
import java.util.Scanner;

public class FileStreamToArrayApp {
    public static Car[] cars;

    public static void main(String[] args) {

        loadFileToArray("cars.txt");
        printArrayData();

    }

    /**
     * метод который читает из файла
     * он получает @param filename - путь до файла что нужно открыть
     * суть метода:
     * 1) открыть файл через Scanner() + File()
     * 2) путем цикла while() + Scanner.hasNext() сделайте так
     * чтобы метод загрузил в массив "cars" все данные
     */
    public static void loadFileToArray(String fileName) {

        File file = new File(fileName);

        if (file.exists()) {
            try {
                Scanner fileIn = new Scanner(file);
                while (fileIn.hasNext()) {

                    String model = fileIn.next();
                    Integer year = fileIn.nextInt();
                    Integer km = fileIn.nextInt();
                    Integer price = fileIn.nextInt();
                    int i = 0;
                    cars = new Car[10];
                    cars[i] = new Car(model, year, km, price);
                    i++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else
            System.err.println("File not exist");
    }

    /**
     * метод который выводит список данных из массива "cars"
     * суть метода:
     * 1) цикл for (each) по массиву "cars"
     * 2) используя Car.toString() преобразует результат
     * на экране в такой формат
     * > 1. CAR: BMW 1999 1000000km  1000USD
     * > 2. CAR: BMW 2011 10000km   20000USD
     * > 3. ....
     */
    public static void printArrayData() {
        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }


    static class Car {
        String model;
        Integer year;
        Integer km;
        Integer price;

        // добавить конструктор и toString()
        // БОНУС - валидировать данные (вдруг отрицательный год или прайс)

        public Car(String model, Integer year, Integer km, Integer price) {
            this.model = model;
            this.year = year < 0 ? year * -1 : year;
            this.km = km < 0 ? km * -1 : km;
            this.price = price < 0 ? price * -1 : price;
        }

        @Override
        public String toString() {
            if (this == null)
                return "null";
            else
                return "Car{" +
                        "model= '" + model + '\'' +
                        ", year= " + year +
                        ", km= " + km +
                        ", price= " + price +
                        '}';
        }


    }

}

