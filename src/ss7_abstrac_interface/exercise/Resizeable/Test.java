package ss7_abstrac_interface.exercise.Resizeable;

import java.awt.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Square square =new Square(5);
//        System.out.println("Area before resizing: "+ square.getArea());
//
//        System.out.println("Enter the resize percent: ");
//
//        square.resize(percent);
//        System.out.println("Area after resizing: "+ square.getArea());

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5,6);
        shapes[2] = new Square(5);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Area before resizing: "+ shapes[i].getArea());
        }
        int percent = scanner.nextInt();


    }
}
