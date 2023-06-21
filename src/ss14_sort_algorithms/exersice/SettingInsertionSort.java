package ss14_sort_algorithms.exersice;

import java.util.Arrays;

public class SettingInsertionSort {
    public static void insertionSort(int[] arr) {
        int x;
        int pos;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {6, 9, 3, 8, 1, 4};
        insertionSort(arr);
    }
}
