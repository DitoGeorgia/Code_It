public class Main {
    public static void main(String[] args) {
        Body body = new Body("Sedan");
        Wheels wheels = new Wheels(4);
        Engine engine = new Engine("BMW", 4.0);

        Car car = new Car(engine, body, wheels);
        System.out.println("Тип Двигателя: " + car.getEngine().getMark() + "\nОбьём Двигателя: " + car.getEngine().getVolume());
        System.out.println(car);

    }
}
