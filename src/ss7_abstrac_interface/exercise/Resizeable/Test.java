package ss7_abstrac_interface.exercise.Resizeable;

import java.awt.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(7, 6);
        Square square = new Square(7);

        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        for (Shape value : shapes) {
            System.out.println("Area before resizing: " + value.getArea());
        }

        System.out.println("Enter the resize percent: ");
        int percent = scanner.nextInt();

        for (Shape value : shapes) {
            value.resize(percent);
        }
        for (Shape value : shapes) {
            System.out.println("Area after resizing: " + value.getArea());
        }

    }
}
