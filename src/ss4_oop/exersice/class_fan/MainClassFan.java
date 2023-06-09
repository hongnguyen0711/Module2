package ss4_oop.exersice.class_fan;

public class MainClassFan {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan);
        fan.setOn(true);
        System.out.println(fan);

        Fan fan1 = new Fan(3, true, 10, "yellow");
        System.out.println(fan1);
        Fan fan2 = new Fan(2, false, 5.5, "red");
        System.out.println(fan2);
    }
}
