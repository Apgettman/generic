package transport;

public class Main {
    public static void main(String[] args) {

        Bus mercedes = new Bus("Mercedes", "9900", 4);
        Bus volvo = new Bus("Volvo", "5890", 6);
        Bus scania = new Bus("Scania", "7822", 5);
        Bus tiger = new Bus("Tiger", "9800", 7);
        mercedes.printInfo();
        volvo.printInfo();
        scania.printInfo();
        tiger.printInfo();

        Car mercedesSl = new Car("Mercedes", "SLS", 6.2);
        Car audi = new Car("Audi", "RS6", 4.2);
        Car ford = new Car("Ford", "GT", 6.0);
        Car bmw = new Car("BMW", "760М", 6.0);
        mercedesSl.printInfo();
        audi.printInfo();
        ford.printInfo();
        bmw.printInfo();

        Truck man = new Truck("MAN", "2312", 7.5);
        Truck zil = new Truck("ZIL", "130", 5.5);
        Truck kamaz = new Truck("KAMAZ", "3301", 6.3);
        Truck gaz = new Truck("GAZ", "2213", 5.2);
        man.printInfo();
        zil.printInfo();
        kamaz.printInfo();
        gaz.printInfo();

        Driver driverB = new Driver("Петров Петр Петрович,", "кат.B,", 11.5);
        System.out.println(driverB.getFio() + " " + driverB.getAvailabilityOfRights() + " Стаж "
                + driverB.getExperience() + " лет! Управляет автомобилем: " + bmw.getBrand() + " и будет участвовать в заезде!");

        Driver driverC = new Driver("Иванов Иван Иванович,", "кат.С,", 15);
        System.out.println(driverC.getFio() + " " + driverC.getAvailabilityOfRights() + " Стаж "
                + driverC.getExperience() + " лет! Управляет грузовиком: " + man.getBrand() + " и будет участвовать в заезде!");

        Driver driverD = new Driver("Васильев Василий Васильевич,", "кат.Д,", 20);
        System.out.println(driverD.getFio() + " " + driverD.getAvailabilityOfRights() + " Стаж "
                + driverD.getExperience() + " лет! Управляет автобусом: " + mercedes.getBrand() + " и будет участвовать в заезде!");

        Driver<Truck> Sergey = new Driver<>("Смирнов Сергей Сергеевич", "кат.С,", 5);
        Sergey.driveC(man);

        Driver<Car> Andrey = new Driver<>("Андреев Андрей Андреевич", "кат.B,", 10);
        Andrey.driveB(bmw);

        Driver<Bus> Dima = new Driver<>("Дмитриев Дмитрий Васильевич", "кат.Д,", 7);
        Dima.driveD(mercedes);
    }
}