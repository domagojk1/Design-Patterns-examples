package bridge;

/**
 * Created by domagoj on 10/25/16.
 */
public class BridgeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(new BlackColor());
        circle.applyColor();;

        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();
    }
}
