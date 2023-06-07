package ss3_array.exersice;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "hello em á";
        int count = 0;
        System.out.println("Hãy nhập kí tự muốn kiểm tra: ");
        char character = sc.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);

    }
}
