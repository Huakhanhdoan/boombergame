import static java.lang.Math.pow;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * public Circle(String color, Boolean filled, double radius).
     *
     * @param color  mau
     * @param filled day
     * @param radius ban kinh
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * An abstract class that represents an algorithm.
     *
     * @author zhangtj
     * @version 1.0
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2.0 * PI * radius;
    }

    public int hashCode() {
        return 222;
    }

    /**
     * An abstract class that represents an algorithm.
     *
     * @author zhangtj
     * @version 1.0
     */
    public boolean equals(Object a) {
        Circle c = (Circle) a;
        if (c.radius - this.radius <= 0.001
                && c.center.getPointX() - this.center.getPointX() <= 0.001
                && c.center.getPointY() - this.center.getPointY() <= 0.001) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        double x = (double) Math.round(center.getPointX() * 10) / 10;
        double y = (double) Math.round(center.getPointY() * 10) / 10;
        double r = (double) Math.round(radius * 10) / 10;
        String s;
        s = "Circle[center=(" + x + ',' + y + "),radius=" + r
                + ",color=" + color + ",filled=" + filled + ']';
        return s;
    }
}
