package ss7_abstrac_interface.exercise.Resizeable;

public class Square extends Shape implements Resizeable {
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, double edge) {
        super(color);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public void resize(double percent) {
        this.edge += this.edge * percent / 100;
    }

    @Override
    public double getArea() {
        return this.edge * this.edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }
}
