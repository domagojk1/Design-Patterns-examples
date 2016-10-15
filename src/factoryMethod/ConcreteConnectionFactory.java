package factoryMethod;

/**
 * Concrete creator
 */
public class ConcreteConnectionFactory extends AbstractConnectionFactory {
    @Override
    protected ConnectionProduct createConnection(String type) {
        if (type.equalsIgnoreCase ("oracle")) {
            return new OracleConnection();
        }
        else if (type.equalsIgnoreCase("sql")) {
            return new SQLConnection();
        }
        else if (type.equalsIgnoreCase("mysql")) {
            return new MySqlConnection();
        }

        return null;
    }
}
