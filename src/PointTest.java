public class PointTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,3);
        Point3D point3D = new Point3D(point2D.x,point2D.y,2);
        System.out.println(point2D.toString());
        System.out.println(point3D.toString());
    }
}
