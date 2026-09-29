class LivingThing {
    void breathe() {
        System.out.println("Breathing");
    }
}

class Animal extends LivingThing {
    void eat() {
        System.out.println("Eating");
    }
}

public class MultilevelInheritance extends Animal {
    public static void main(String[] args) {
        MultilevelInheritance dog = new MultilevelInheritance();
        dog.breathe();
        dog.eat();
    }
}
