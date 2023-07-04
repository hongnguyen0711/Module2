package practice_test;

import java.util.ArrayList;
import java.util.List;

public class GiaiThuatVong {
    public static void main(String[] args) {
        int num1 = 100 ;
        int num2 = 1000;
        System.out.println(checkNum(num1,num2));

    }
    public static int checkNum(int num1,int num2){
        int count = 0;
//        for (int i = num1; i <=num2 ; i++) {
//            if (i/10== 0){
//                count++;
//            }else if(i/10 < 10){
//                if (i/10 ==i%10){
//                    count++;
//                }
//            }else if(i/100 <10){
//                if (i/100 == i%10){
//                    count++;
//                }
//            }else if (i/1000 <10){
//                if (i/1000 == i%10){
//                    count++;
//                }
//            }
//        }
        for (int i = num1; i <= num2; i++) {
            if (String.valueOf(i).length()==1){
                count++;
            }else if ((String.valueOf(i).charAt(0)) == (String.valueOf(i).charAt((String.valueOf(i).length())-1))){
                count++;
            }
        }
        return count;

    }
}
