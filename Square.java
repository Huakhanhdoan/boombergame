public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        setSide(side);
    }


    /**
     * Square(double side, String color, Boolean filled).
     *
     * @param side   canh
     * @param color  mau
     * @param filled day
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public int hashCode() {
        return 555;
    }

    /**
     * An abstract class that represents an algorithm.
     *
     * @author zhangtj
     * @version 1.0
     */
    public boolean equals(Object a) {
        Square c = (Square) a;
        if (c.length - this.length <= 0.001 && c.topLeft.getPointX()
                - this.topLeft.getPointX() <= 0.001
                && c.topLeft.getPointY() - this.topLeft.getPointY() <= 0.001) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {

        return String.format("Square[topLeft=(%.1f,%.1f),side=%.1f,color=%s,filled=%b]",
                topLeft.getPointX(), topLeft.getPointY(), length, color, filled);
    }
}
