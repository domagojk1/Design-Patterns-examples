package prototype;

/**
 * Concrete prototype
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
