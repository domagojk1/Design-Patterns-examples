package prototype;

import java.util.Hashtable;

/**
 * Created by domagoj on 10/15/16.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeHashtable = new Hashtable<String,Shape>();

    public static Shape getShape (String shapeId) {
        Shape cachedShape = shapeHashtable.get (shapeId);
        if (cachedShape != null) {
            return (Shape) cachedShape.clone();
        }
        else {
            return null;
        }
    }

    public static void loadCache () {
        Square square = new Square();
        square.setId("1");
        shapeHashtable.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeHashtable.put(rectangle.getId(), rectangle);
    }
}
