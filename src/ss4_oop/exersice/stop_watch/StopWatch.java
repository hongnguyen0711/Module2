package ss4_oop.exersice.stop_watch;

import java.time.LocalTime;

public class StopWatch {
    long startTime;
    long endTime;

    private long getEndTime() {
        return this.endTime;
    }

    private long getStartTime() {
        return this.startTime;
    }

    public void getTimeNow() {
        System.out.println(LocalTime.now());
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        System.out.println(this.startTime);
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
        System.out.println(this.endTime);
    }

    public void elapsedTime() {
        System.out.println(this.endTime - this.startTime);
    }


}
