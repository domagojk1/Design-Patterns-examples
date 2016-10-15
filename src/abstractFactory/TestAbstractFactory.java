package abstractFactory;

/**
 * Created by domagoj on 10/15/16.
 */
public class TestAbstractFactory {
    public static void main (String[] args) {
        GUIClient client = new GUIClient();
        client.buildWindow (new MacOSXFactory());
    }
}
