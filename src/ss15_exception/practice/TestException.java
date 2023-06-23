package ss15_exception.practice;

import java.util.Scanner;


public class TestException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            try {
                System.out.print("Hãy nhập cạnh 1: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Hãy nhập cạnh 2: ");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.print("Hãy nhập cạnh 3: ");
                int c = Integer.parseInt(scanner.nextLine());
                Triangle triangle = new Triangle(a, b, c);
                System.out.println(triangle);
                flag = false;
            } catch (IllegalTriangleException e) {
                System.out.println("Tam giác không hợp lệ!");
            } catch (NumberFormatException e) {
                System.out.println("không hợp lệ!");
            } catch (Exception e){
                System.out.println("không hợp lệ!");
            }
        } while (flag);
    }
}