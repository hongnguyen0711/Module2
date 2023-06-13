package ss7_abstrac_interface.exercise.Colorable;

public class Test {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red", false, 5);
        shapes[1] = new Square("blue", true, 7);
        shapes[2] = new Rectangle("yelow", true, 7, 6);
        for (Shape value : shapes) {
            System.out.println(value.getArea());
            if (value instanceof Square) {
                System.out.println(((Square) value).howToColor());
            }
        }
    }
}
