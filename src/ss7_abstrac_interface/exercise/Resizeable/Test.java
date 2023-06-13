package ss7_abstrac_interface.exercise.Resizeable;

import java.awt.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(7);
        shapes[1] = new Rectangle(7, 6);
        shapes[2] = new Square(7);

        for (Shape value : shapes) {
            System.out.println("Area before resizing: " + value.getArea());
        }

        System.out.println("Enter the resize percent: ");
        int percent = scanner.nextInt();
        ((Circle) shapes[0]).resize(percent);
        ((Rectangle) shapes[1]).resize(percent);
        ((Square) shapes[2]).resize(percent);

        for (Shape value : shapes) {
            System.out.println("Area after resizing: " + value.getArea());
        }

    }
}
