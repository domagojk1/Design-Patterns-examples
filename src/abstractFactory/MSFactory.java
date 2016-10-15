package abstractFactory;

/**
 * Concrete factory
 */
public class MSFactory implements IWindowFactory {
    @Override
    public IWindow createWindow() {
        return new MSWindow();
    }
}
