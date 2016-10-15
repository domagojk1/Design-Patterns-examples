package abstractFactory;

/**
 * Concrete product
 */
public class MacOSXWindow implements IWindow {
    @Override
    public void setTitle(String text) {
        System.out.println ("MacOsXWindow title: " + text);
    }

    @Override
    public void repaint() {
        System.out.println ("MacOsXWindow repainting...");
    }
}
