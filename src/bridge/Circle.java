package bridge;

/**
 * Created by domagoj on 10/25/16.
 */
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Circle filled with color ");
        color.applyColor();
    }
}
