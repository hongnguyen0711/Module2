package ss4_oop.exersice.class_fan;

public class MainClassFan {
    public static void main(String[] args) {
        ClassFan fan = new ClassFan();
        System.out.println(fan);
        fan.setOn(true);
        System.out.println(fan);

        ClassFan fan1 = new ClassFan(3, true, 10, "yellow");
        System.out.println(fan1);
        ClassFan fan2 = new ClassFan(2, false, 5.5, "red");
        System.out.println(fan2);
    }
}
