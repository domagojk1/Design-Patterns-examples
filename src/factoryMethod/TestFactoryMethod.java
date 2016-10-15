package factoryMethod;

/**
 * Test factory method
 */
public class TestFactoryMethod {

    public static void main (String[] args) {
        IConnection connectionProduct = new ConcreteCreator().createConnection("sql");
    }
}
