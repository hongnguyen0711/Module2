package ss2_loop_statement.exercise;

public class Prime1 {
    public static void main(String[] args) {
        int countPrime = 0;
        int num = 2;
        do {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(num);
                countPrime++;
            }
            num++;
        } while (countPrime < 20);

    }
}
