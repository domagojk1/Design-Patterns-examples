package factoryMethod;

/**
 * Created by domagoj on 10/15/16.
 */
public class SQLConnection implements ConnectionProduct {

    public SQLConnection() {
        System.out.println ("Creating sql connection...");
    }
}
