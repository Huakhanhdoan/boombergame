import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point x) {
        return sqrt(pow((pointX - x.getPointX()), 2) + pow(pointY - x.getPointY(), 2));
    }

    public boolean equals(Object x) {
        Point y = (Point) x;
        return y.getPointX() == pointX && y.getPointY() == pointY;
    }

    public int hashCode() {
        return 555;
    }

    public String toString() {
        String s = "(" + pointX + ',' + pointY + ')';
        return s;
    }
}
