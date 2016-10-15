package abstractFactory;

/**
 * Concrete factory
 */
public class MacOSXFactory implements IWindowFactory {
    @Override
    public IWindow createWindow() {
        return new MacOSXWindow();
    }
}
