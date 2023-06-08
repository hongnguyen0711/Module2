package ss4_oop.exersice.quadratic_equation;

import java.util.Scanner;

public class MainQuadraticEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        QuadraticEquation quadratic = new QuadraticEquation(a, b, c);
        if (quadratic.getDiscriminant() < 0) {
            System.out.println("The equation has no roots!");
        } else if (quadratic.getDiscriminant() == 0) {
            System.out.println("The equation has one root: " + (-quadratic.getB() / 2 * quadratic.getA()));
        } else {
            System.out.println("The equation has two root: " + quadratic.getRoot1() + " and " + quadratic.getRoot2());
        }

    }
}

