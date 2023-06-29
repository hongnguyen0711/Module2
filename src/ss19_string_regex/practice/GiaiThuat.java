package ss19_string_regex.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GiaiThuat {
    public static void main(String[] args) {
        int[] arr = {-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i] && a[j] != -1) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }
}
