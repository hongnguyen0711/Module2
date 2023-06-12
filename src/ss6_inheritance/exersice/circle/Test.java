package ss6_inheritance.exersice.circle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(5, "red", 10);
        System.out.println(cylinder);
        System.out.println("cylinder volume: " + cylinder.getVolume());
    }
}
