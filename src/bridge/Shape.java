package bridge;

/**
 * Created by domagoj on 10/25/16.
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
