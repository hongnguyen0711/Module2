package ss4_oop.practice;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào chiều dài:");
        float width = scanner.nextFloat();
        System.out.println("Hãy nhập vào chiều rộng:");
        float height = scanner.nextFloat();

        Rectangle hcn = new Rectangle(width, height);
        System.out.println("Diện tích là: " + hcn.getArea() + "Chu vi là: " + hcn.getPerimeter());
    }
}
