package factoryMethod;

/**
 * Created by domagoj on 10/15/16.
 */
public class MySqlConnection implements IConnection {

    public MySqlConnection() {
        System.out.println ("Creating mysql connection...");
    }
}
