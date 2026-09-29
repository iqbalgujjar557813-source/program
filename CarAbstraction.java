abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

public class CarAbstraction extends Vehicle {
    void start() {
        System.out.println("Car started");
    }

    public static void main(String[] args) {
        CarAbstraction car = new CarAbstraction();
        car.start();
        car.stop();
    }
}
