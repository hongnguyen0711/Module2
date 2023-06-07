package ss3_array.exersice;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Hãy nhập vào phần tử thứ\t" + (i + 1));
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là " + min + " ở vị trí " + index);
    }
}
