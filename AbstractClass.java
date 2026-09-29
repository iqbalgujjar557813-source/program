abstract class Animal {
    abstract void sound();
}

public class AbstractClass extends Animal {
    void sound() {
        System.out.println("A dog barks");
    }

    public static void main(String[] args) {
        new AbstractClass().sound();
    }
}
