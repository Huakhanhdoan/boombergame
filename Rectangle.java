public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Rectangle(String color, Boolean filled, double width, double length).
     *
     * @param color  mau
     * @param filled day
     * @param width  rong
     * @param length dai
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * An abstract class that represents an algorithm.
     *
     * @author zhangtj
     * @version 1.0
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2.0 * width + 2.0 * length;
    }

    public int hashCode() {
        return 333;
    }

    /**
     * An abstract class that represents an algorithm.
     *
     * @author zhangtj
     * @version 1.0
     */
    public boolean equals(Object a) {
        Rectangle c = (Rectangle) a;
        if (c.length - this.length <= 0.001 && c.topLeft.getPointX()
                - this.topLeft.getPointX() <= 0.001
                && c.topLeft.getPointY() - this.topLeft.getPointY() <= 0.001
                && c.width - this.width <= 0.001) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[topLeft=(%.1f,%.1f),width=%.1f,"
                        + "length=%.1f,color=%s,filled=%b]",
                topLeft.getPointX(), topLeft.getPointY(), width, length, color, filled);
    }
}
