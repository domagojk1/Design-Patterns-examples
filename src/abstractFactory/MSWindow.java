package abstractFactory;

/**
 * Concrete product
 */
public class MSWindow implements IWindow {
    @Override
    public void setTitle(String text) {
        System.out.println ("MSWindow title: " + text);
    }

    @Override
    public void repaint() {
        System.out.println ("MSWindow repainting...");
    }
}
