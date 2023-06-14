import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        System.out.println(solution(arr));


    }


    static boolean solution(int[] a) {
        boolean flag = false;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                sum1 += a[j];
            }
            for (int j = i + 1; j < a.length; j++) {
                sum2 += a[j];
            }
            if (sum1 == sum2) {
                flag = true;
                break;
            }else {
                sum1 =0;
                sum2 =0;
            }
        }
        return flag;
    }
}