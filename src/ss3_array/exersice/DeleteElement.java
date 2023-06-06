package ss3_array.exersice;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = 0;
        System.out.println("Hãy nhập vào phần tử cần xóa");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                index = i;
            }
        }
        for (int i = index + 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];

        }
        arr[arr.length - 1] = 0;

        System.out.println(Arrays.toString(arr));
    }
}
