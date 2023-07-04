package practice_test;

import com.sun.javafx.webkit.WebConsoleListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TimKiem {
    //dùng contain.
    public static void main(String[] args) {
        int[] parent = {1, 4, 5, 2, 3, 3, 2, 1,1,5};
        int[] child = {1,2,5};
        System.out.println(checkArr(parent, child));
    }

    public static int checkArr(int[] parent, int[] child) {
        Map<Integer, Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        for (int e : parent) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            } else {
                map.put(e, 1);
            }
        }
        for (int e : child) {
            if (map.containsKey(e)) {
                list.add(map.get(e));
            }
        }
        if (list.size() == child.length) {
            int min = list.get(0);
            for (Integer e : list) {
                if (min > e) {
                    min = e;
                }
            }
            return min;
        }
        return 0;
    }
}
