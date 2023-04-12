package OOP.pillars.abstraction;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(10, 7);
        double area1 = shape1.computeArea();
        System.out.println(area1);

        Shape shape2 = new Circle(12.0);
        double area2 = shape2.computeArea();
        System.out.println(area2);
    }
}
