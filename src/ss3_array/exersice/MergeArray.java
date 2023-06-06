package ss3_array.exersice;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] brr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] newArr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < brr.length; i++) {
            newArr[arr.length + i] = brr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
