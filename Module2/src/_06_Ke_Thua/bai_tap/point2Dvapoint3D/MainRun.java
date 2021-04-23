package _06_Ke_Thua.bai_tap.point2Dvapoint3D;

public class MainRun {
    public static void main(String[] args) {

        Point2D point2D = new Point2D();
        point2D.setX(6);
        point2D.setY(5);
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D();
        point3D.setX(point2D.getX());
        point3D.setY(point2D.getY());
        point3D.setZ(7);
        System.out.println(point3D.toString());

    }
}
