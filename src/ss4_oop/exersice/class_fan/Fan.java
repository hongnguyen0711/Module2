package ss4_oop.exersice.class_fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blu";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLow() {
        return SLOW;
    }

    public int getMedium() {
        return MEDIUM;
    }

    public int getFast() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "ClassFan{" +
                    "on=" + on +
                    ", speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' + ",fan is on" +
                    '}';
        } else {
            return "ClassFan{" +
                    "on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' + ",fan is off" +
                    '}';
        }

    }
}
