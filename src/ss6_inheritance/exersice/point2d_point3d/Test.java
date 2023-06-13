package ss6_inheritance.exersice.point2d_point3d;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 4);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D(3, 4, 5);
        System.out.println(point3D);
        point3D.setXYZ(8, 9, 10);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
