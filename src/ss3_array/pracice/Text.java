package ss3_array.pracice;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                {1,2,3},
                {4,6},
                {7,8,9}
        };
        System.out.println("Hãy nhập số cột muốn tính tổng:");
        int colum = sc.nextInt();
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length - 1 >= colum) {
                sum += arr[i][colum];
            }
        }
        System.out.println(sum);
    }
}
