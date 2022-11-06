package transport;

public class Car extends Transport implements Competing, iCanDrive {

    public Car(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }
    public void startMoving() {
        System.out.println( "Начинаю движение");
    }
    public void stopMoving() {
        System.out.println("Завершаю движение");
    }
    public void pitStop() {
        System.out.println("Пит-Стоп 2 минуты");
    }
    public void bestLapTime() {
        System.out.println("Лучший круг за 5 минут");
    }
    public void maximumSpeed() {
        System.out.println("Максимальная скорость 200 км/ч");
    }
    public void refuel() {
    }
    public void driver(String category) {
        System.out.println("Я управляю: " + getBrand());
        System.out.println("У именя: " + Car.CATEGORY_B);
    }
}