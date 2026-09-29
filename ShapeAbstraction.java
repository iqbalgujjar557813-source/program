abstract class Shape {
    abstract int area();
}

public class ShapeAbstraction extends Shape {
    int area() {
        return 4 * 5;
    }

    public static void main(String[] args) {
        Shape rectangle = new ShapeAbstraction();
        System.out.println(rectangle.area());
    }
}
