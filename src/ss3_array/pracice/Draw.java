package ss3_array.pracice;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j == 4 || j - i == 5 || i - j == 4 || i + j == 13) {
                    System.out.print(i+1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
