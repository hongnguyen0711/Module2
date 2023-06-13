package ss7_abstrac_interface.exercise.Colorable;

public abstract class Shape {
    public String color;
    public boolean fill;

    public Shape() {
    }

    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public abstract double getArea();
}
