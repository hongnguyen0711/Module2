package ss7_abstrac_interface.exercise.Colorable;

public class Square extends Shape {
    private double edge;

    public Square() {
    }

    public Square(String color, boolean fill, double edge) {
        super(color, fill);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    @Override
    public double getArea() {
        return this.edge*this.edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                ", color='" + color + '\'' +
                ", fill=" + fill +
                '}';
    }
}
