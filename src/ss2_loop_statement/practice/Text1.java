package ss2_loop_statement.practice;

import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter anumber: ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("The sum is: " + sum);
    }

}
