class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal { }
class Cat extends Animal { }

public class HierarchicalInheritance {
    public static void main(String[] args) {
        new Dog().sound();
        new Cat().sound();
    }
}
