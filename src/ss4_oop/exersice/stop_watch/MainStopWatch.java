package ss4_oop.exersice.stop_watch;

import ss4_oop.exersice.stop_watch.StopWatch;

import java.util.Scanner;

public class MainStopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch watch = new StopWatch();
        while (true) {
            System.out.println("Menu:\n1.Time now\n2.Start time\n3.Stop time\n4.Time has passed\n5.Exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    watch.getTimeNow();
                    break;
                case 2:
                    watch.start();
                    break;
                case 3:
                    watch.stop();
                    break;
                case 4:
                    watch.elapsedTime();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
