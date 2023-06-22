package ss15_exception.exersice;

import java.util.Scanner;


public class UseMyException {
    public static void checkEdgeTriangle(int a, int b, int c) throws MyException {
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new MyException("Ba cạnh không hợp lệ!");
        } else {
            System.out.println("Ba cạnh hợp lệ!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            try {
                System.out.print("Hãy nhập a: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Hãy nhập b: ");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.print("Hãy nhập c: ");
                int c = Integer.parseInt(scanner.nextLine());
                checkEdgeTriangle(a, b, c);
                flag = false;
            } catch (MyException e) {
                System.out.println("Ba cạnh không hợp lệ!");
            } catch (NumberFormatException e) {
                System.out.println("Ba cạnh không hợp lệ!!");
            }

        } while (flag);

    }

}