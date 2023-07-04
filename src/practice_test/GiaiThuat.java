package practice_test;

import java.util.*;

public class GiaiThuat {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Hãy nhập vào độ dài của ma trận:");
//        int a = sc.nextInt();
//        int[][] arr = new int[a][a];
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < a; j++) {
//                System.out.println("Hãy nhập phần tử thứ:" + i + "-" + j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
        int[][] arr = {
                {9, 7, 5},
                {3, 1, 2},
                {5, 1, 11}
        };
        System.out.println(Arrays.toString(checkArray(arr)));

    }

    public static int[] checkArray(int[][] arr) {
        Set<Integer> listNumPime = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (checkPrime(arr[i][j]) == 1) {
                    listNumPime.add(arr[i][j]);
                }
            }
        }
        int[] newArr = new int[listNumPime.size()];
        int index = 0;
        for (Integer i : listNumPime) {
            newArr[index] = i;
            index++;
        }
        return newArr;
    }

    public static int checkPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return 1;
        }
        return -1;
    }

}
