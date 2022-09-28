public class test {
    public static void main(String[] args) {
        Point sq1 = new Point(3.5,4.5);
       Point s2 = new Point(6.5, 7.5);
       Circle s3 = new Circle(s2,5,"red",true);
       Rectangle hcn = new Rectangle(sq1,3.55,4.63,"RED",true);
        Square hv = new Square(sq1,5,"blue",true);
        Layer s = new Layer();

        s.addShape(s3);
        s.addShape(hcn);
        s.addShape(s3);
        s.addShape(hv);
        s.addShape(s3);
s.removeDuplicates();
        System.out.println( s.getInfo());
    }
}
