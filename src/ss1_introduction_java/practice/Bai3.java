package ss1_introduction_java.practice;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Hãy nhập vào số muốn đọc:");
        input = sc.nextInt();
        String[] name = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] name1 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] name2 = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (input >= 0 && input <= 10) {
            System.out.printf(name[input]);
        } else if (input < 20) {
            System.out.println(name1[input - 10]);
        } else if (input <= 99) {
            int temp1 = input / 10;
            int temp2 = input % 10;
            if (temp2 == 0) {
                System.out.println(name2[temp1]);
            } else
                System.out.println(name2[temp1] + " " + name[temp2]);
        } else if (input >= 100) {
            int temp1 = input / 100;
            int temp2 = input % 100;
            int temp3 = temp2 / 10;
            int temp4 = temp2 % 10;
            if (temp2 == 0) {
                System.out.println(name[temp1] + "hundred");
            } else if (temp3 == 0) {
                System.out.println(name[temp1] + " " + "hundred and" + " " + name[temp4]);
            } else if (temp4 == 0) {
                System.out.println(name[temp1] + " " + "hundred" + " " + name2[temp3]);
            } else if (temp2 < 20) {
                System.out.println(name[temp1] + " " + "hundred" + " " + name1[temp2 - 10]);
            } else {
                System.out.println(name[temp1] + " " + "hundred" + " " + name2[temp3] + name[temp4]);
            }
        }
    }
}
