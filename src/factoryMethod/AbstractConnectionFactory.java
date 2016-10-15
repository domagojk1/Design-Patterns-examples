package factoryMethod;

/**
 * Creator
 */
public abstract class AbstractConnectionFactory {
    protected abstract ConnectionProduct createConnection (String type);
}
