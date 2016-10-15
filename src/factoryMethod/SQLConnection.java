package factoryMethod;

/**
 * Created by domagoj on 10/15/16.
 */
public class SQLConnection implements IConnection {

    public SQLConnection() {
        System.out.println ("Creating sql connection...");
    }
}
