package ss3_array.exersice;

import java.util.Scanner;

public class SumMainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào độ dài của ma trận:");
        int a = sc.nextInt();
        float[][] arr = new float[a][a];
        float sum = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.println("Hãy nhập phần tử thứ:" + i + "-" + j);
                arr[i][j] = sc.nextFloat();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("Tổng đường chéo chính là: " + sum);
    }
}
