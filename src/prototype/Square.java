package prototype;

/**
 * Created by domagoj on 10/15/16.
 */
public class Square extends Shape {
    public Square() {
        type = "square";
    }

    @Override
    void draw() {
        System.out.println ("Drawing square...");
    }
}
