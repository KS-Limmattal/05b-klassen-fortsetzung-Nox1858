import java.awt.Point;

public class PointTester {
    public static void main(String[] args) {
        Point p = new Point(2,5);
        System.out.println(p);
        p.setLocation(p.getY(),p.getX());
        System.out.println(p);
        Point q = p.getLocation();
        System.out.println(q.equals(p) ? "Inhaltsgleich" : "Nicht gleich");
        System.out.println(q == p ? "gleiches Objekt" : "separate Objekte");
    }
}
