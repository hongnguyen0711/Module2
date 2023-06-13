package ss7_abstrac_interface.exercise.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double darius;

    public Circle() {
    }

    public Circle(double darius) {
        this.darius = darius;
    }

    public Circle(String color, double darius) {
        super(color);
        this.darius = darius;
    }

    public double getDarius() {
        return darius;
    }

    public void setDarius(double darius) {
        this.darius = darius;
    }

    @Override
    public void resize(double percent) {
        this.darius += this.darius * percent / 100;
    }

    @Override
    public double getArea() {
        return Math.PI * this.darius * this.darius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "darius=" + darius +
                '}';
    }
}
