package ss5_access_modifier_static.exersice.circle;

import ss5_access_modifier_static.exersice.circle.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());

        Circle circle1 = new Circle(5.5);
        System.out.println(circle1.getRadius() + " area: " + circle.getArea());
    }
}
