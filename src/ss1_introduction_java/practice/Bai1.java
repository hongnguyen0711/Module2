package ss1_introduction_java.practice;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập tên của bạn:");
        String name = input.nextLine();
        System.out.println("Hello:" + name);
    }
}
