package ss6_inheritance.exersice.Point_MoveablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(1, 1);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(2, 2, 3, 4);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
