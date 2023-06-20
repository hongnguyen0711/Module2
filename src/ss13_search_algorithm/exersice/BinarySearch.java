package ss13_search_algorithm.exersice;

import java.sql.Array;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {6, 8, 10, 1, 3, 5};
        int[] newArr = sort(arr);
        System.out.println(Arrays.toString(newArr));
        System.out.println(searchBinary(newArr, 11, 0, newArr.length - 1));
    }

    public static int searchBinary(int[] arr, int key, int fist, int last) {

        if (last >= fist) {
            int mid = (fist + last) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                return searchBinary(arr, key, fist, mid - 1);
            } else {
                return searchBinary(arr, key, mid + 1, last);
            }
        }
        return -1;
    }

    private static int[] sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

}
