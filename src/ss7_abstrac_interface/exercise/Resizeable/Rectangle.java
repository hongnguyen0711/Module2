package ss7_abstrac_interface.exercise.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void resize(double percent) {
        this.length += this.length*percent/100;
    }
    @Override
    public double getArea(){
        return this.length*this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
