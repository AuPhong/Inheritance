import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparator extends Rectangle implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        if (o1.getPerimeter() > o2.getPerimeter()) return 1;
        if (o1.getPerimeter() < o2.getPerimeter()) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];

        rectangles[1] = new Rectangle(3,5);
        rectangles[2] = new Rectangle(4,7);
        rectangles[0] = new Rectangle(3,4);

        RectangleComparator comparator = new RectangleComparator();
        Arrays.sort(rectangles, comparator);
        for (Rectangle rectangle:rectangles) {
            System.out.println(rectangle);
        }
    }
}
