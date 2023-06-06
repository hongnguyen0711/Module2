package ss2_loop_statement.exercise;

import com.sun.corba.se.impl.encoding.CDROutputObject;

import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu: \n1.Print the rectangle\n2.Print the square triangle\n3.Print isosceles triangle\n4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hãy nhập vào chiều dài:");
                    int a = sc.nextInt();
                    System.out.println("Hãy nhập vào chiều rộng:");
                    int b = sc.nextInt();
                    for (int i = 0; i < b; i++) {
                        for (int j = 0; j < a; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("1.top-left");
                    System.out.println("2.top-right");
                    System.out.println("3.botton-left");
                    System.out.println("4.botton-right");
                    int triangle = sc.nextInt();
                    switch (triangle) {
                        case 1:
                            System.out.println("Hãy nhập vào chiều cao:");
                            int h1 = sc.nextInt();
                            for (int i = 0; i <= h1; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            System.out.println("Hãy nhập vào chiều cao:");
                            int h2 = sc.nextInt();
                            for (int i = 0; i <= h2; i++) {
                                for (int j = 5; j > i; j--) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            System.out.println("Hãy nhập vào chiều cao:");
                            int h3 = sc.nextInt();
                            for (int i = 0; i <= h3; i++) {
                                for (int j = 0; j < h3; j++) {
                                    if (i + j >= h3) {
                                        System.out.print("*");
                                    } else {
                                        System.out.print(" ");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            System.out.println("Hãy nhập vào chiều cao:");
                            int h4 = sc.nextInt();
                            for (int i = 0; i < h4; i++) {
                                for (int j = 0; j < h4; j++) {
                                    if (j >= i) {
                                        System.out.print("*");
                                    } else {
                                        System.out.print(" ");
                                    }
                                }
                                System.out.println();
                            }
                    }

                    break;
                case 3:
                    System.out.println("Hãy nhập vào chiều cao:");
                    int h1 = sc.nextInt();
                    for (int i = 0; i <= h1; i++) {
                        for (int j = 0; j <= h1 * 2; j++) {
                            if (j - i <= h1 && i + j >= h1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
            }

        }
    }
}
