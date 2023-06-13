package ss7_abstrac_interface.exercise.Colorable;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(String color, boolean fill, double radius) {
        super(color, fill);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", fill=" + fill +
                '}';
    }
}
