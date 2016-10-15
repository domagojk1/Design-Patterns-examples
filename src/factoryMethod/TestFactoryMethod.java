package factoryMethod;

/**
 * Test factory method
 */
public class TestFactoryMethod {

    public static void main (String[] args) {
        ConnectionProduct connectionProduct = new ConcreteConnectionFactory().createConnection("sql");
    }
}
