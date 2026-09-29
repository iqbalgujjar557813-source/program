interface Greeting {
    void sayHello();
}

class EnglishGreeting implements Greeting {
    public void sayHello() {
        System.out.println("Hello!");
    }
}

class SpanishGreeting implements Greeting {
    public void sayHello() {
        System.out.println("¡Hola!");
    }
}

public class InterfacePolymorphism {
    public static void main(String[] args) {
        Greeting greeting = new EnglishGreeting();
        greeting.sayHello();
        greeting = new SpanishGreeting();
        greeting.sayHello();
    }
}
