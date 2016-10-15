package factoryMethod;

/**
 * Concrete creator
 */
public class ConcreteCreator implements Creator {
    @Override
    public IConnection createConnection(String type) {
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
