package ss7_abstrac_interface.exercise.Resizeable;

public abstract class Shape implements Resizeable {
    public String color = "blue";

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }


    @Override
    public void resize(double percent) {
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
