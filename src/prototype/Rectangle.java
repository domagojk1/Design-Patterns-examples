package prototype;

/**
 * Created by domagoj on 10/15/16.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "rectangle";
    }

    @Override
    void draw() {
        System.out.println ("Drawing rectangle...");
    }
}
