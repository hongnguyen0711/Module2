package ss3_array.exersice;

import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] newArr = new int[arr.length + 1];

        System.out.println("Hãy nhập phần tử muốn thêm:");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập vào vị trí muốn thêm:");
        int index = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (index == i) {
                newArr[i] = number;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
