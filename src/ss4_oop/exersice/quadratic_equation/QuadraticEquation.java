package ss4_oop.exersice.quadratic_equation;

public class QuadraticEquation {

    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(this.getDiscriminant())) / 2 * this.a;
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant())) / 2 * this.a;
    }


}
