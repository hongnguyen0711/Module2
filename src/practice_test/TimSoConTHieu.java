package practice_test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TimSoConTHieu {
    public static void main(String[] args) {
        String str = "5,2,1,8";
        String[] array = str.split(",");

        System.out.println(Arrays.toString(checkNum(array)));
    }

    public static int[] checkNum(String[] arr) {
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if (min > Integer.parseInt(arr[i])) {
                min = Integer.parseInt(arr[i]);
            }
            if (max < Integer.parseInt(arr[i])) {
                max = Integer.parseInt(arr[i]);
            }
        }

        Set<Integer> set = new TreeSet<>();
        while (min <= max){
            set.add(min);
            min++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(Integer.parseInt(arr[i]))){
                set.remove(Integer.parseInt(arr[i]));
            }
        }

        int index=0;
        int[] newArr = new int[set.size()];
        for (Integer i : set) {
            newArr[index] = i;
            index++;
        }
        return newArr;
    }
}
