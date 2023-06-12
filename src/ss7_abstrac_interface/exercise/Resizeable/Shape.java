package ss7_abstrac_interface.exercise.Resizeable;

public abstract class Shape {
    public String color = "blue";

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

}
