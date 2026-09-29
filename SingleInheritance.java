class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

public class SingleInheritance extends Animal {
    public static void main(String[] args) {
        SingleInheritance dog = new SingleInheritance();
        dog.eat();
    }
}
