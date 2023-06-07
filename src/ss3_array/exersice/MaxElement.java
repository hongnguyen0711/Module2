package ss3_array.exersice;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào số hàng:");
        int a = sc.nextInt();
        System.out.println("Hãy nhập vào số cột:");
        int b = sc.nextInt();
        float[][] arr = new float[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Hãy nhập giá trị thứ:" + i + "-" + j);
                arr[i][j] = sc.nextFloat();
            }
        }
        float max = arr[0][0];
        int indexRow = 0;
        int indexCol = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất là: " + max + "  ở vị trí:" + indexRow + "-" + indexCol);
    }
}
