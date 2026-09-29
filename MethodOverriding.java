class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

public class MethodOverriding extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        new MethodOverriding().sound();
    }
}
