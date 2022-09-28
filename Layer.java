import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape a) {
        shapes.add(a);
    }

    /**
     * An abstract class that represents an algorithm.
     *
     * @author zhangtj
     * @version 1.0
     */
    public void removeCircles() {
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).hashCode() == 222) {
                index.add(i);
            }

        }

        for (int i = 0; i < index.size(); i++) {
            int j = index.get(i);
            shapes.remove(j - i);
        }

    }

    /**
     * An abstract class that represents an algorithm.
     *
     * @author zhangtj
     * @version 1.0
     */
    public String getInfo() {
        String s = "Layer of crazy shapes:\n";
        for (Shape a : shapes) {
            s += a.toString() + "\n";
        }
        return s;
    }

    /**
     * An abstract class that represents an algorithm.
     *
     * @author zhangtj
     * @version 1.0
     */
    public void removeDuplicates() {
        int temp = shapes.size();
        for (int i = 0; i < temp; i++) {

            for (int j = i + 1; j < temp; j++) {
                if (shapes.get(i).hashCode() == shapes.get(j).hashCode()
                        && shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                    temp--;
                }
            }

        }

    }
}
