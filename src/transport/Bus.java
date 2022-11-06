package transport;
public class Bus extends Transport implements Competing, iCanDrive {
    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }
     public void startMoving() {
        System.out.println("Начинаю движение");
    }
    public void stopMoving() {
        System.out.println("Завершаю движение");
    }
    public void pitStop() {
        System.out.println("Пит-Стоп 3 минуты");
    }
    public void bestLapTime() {
        System.out.println("Лучший круг за 6 минут");
    }
    @Override
    public void maximumSpeed() {
        System.out.println("Лучшая скорость 180 км/ч");
    }
    public void refuel() {

    }
    public void driver(String category) {
        System.out.println("Я управляю: " + getBrand());
        System.out.println("У именя: " + Bus.CATEGORY_D);
    }
}