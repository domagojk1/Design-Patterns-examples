package abstractFactory;

/**
 * Client
 */
public class GUIClient {
    public void buildWindow (IWindowFactory factory) {
        IWindow window = factory.createWindow();
        window.setTitle ("My window");
    }
}
