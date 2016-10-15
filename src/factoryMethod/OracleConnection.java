package factoryMethod;

/**
 * Created by domagoj on 10/15/16.
 */
public class OracleConnection implements ConnectionProduct {

    public OracleConnection() {
        System.out.println ("Creating oracle connection...");
    }
}
