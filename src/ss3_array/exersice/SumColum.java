package ss3_array.exersice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumColum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int a = sc.nextInt();
        float[][] arr = new float[a][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Hãy nhập số phần tử mảng " + i);
            int b = sc.nextInt();
            arr[i] = new float[b];
            for (int j = 0; j < b; j++) {
                System.out.println("Hãy nhập phần tử thứ " + i + "-" + j);
                arr[i][j] = sc.nextFloat();
            }
        }
        System.out.println("Hãy nhập số cột muốn tính tổng:");
        int colum = sc.nextInt();
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length - 1 >= colum) {
                sum += arr[i][colum];
            }
        }
        System.out.println(sum);
    }
}
