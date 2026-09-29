class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class SuperKeyword extends Person {
    SuperKeyword(String name) {
        super(name);
    }

    public static void main(String[] args) {
        SuperKeyword student = new SuperKeyword("Mia");
        System.out.println(student.name);
    }
}
