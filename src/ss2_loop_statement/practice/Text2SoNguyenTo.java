package ss2_loop_statement.practice;

import java.util.Scanner;

public class Text2SoNguyenTo {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số cần kiểm tra:");
        number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + "\t không phải là số nguyên tố!");
        } else {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(number + "\t là số nguyên tố!");
            } else {
                System.out.println(number + "\t không phải là số nguyên tố!");
            }
        }
    }
}
