interface Switchable {
    void turnOn();
}

public class InterfaceAbstraction implements Switchable {
    public void turnOn() {
        System.out.println("Light is on");
    }

    public static void main(String[] args) {
        Switchable light = new InterfaceAbstraction();
        light.turnOn();
    }
}
