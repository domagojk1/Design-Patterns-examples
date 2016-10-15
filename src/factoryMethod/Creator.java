package factoryMethod;

/**
 * Creator
 */
public abstract class Creator {
    protected abstract IConnection createConnection (String type);
}
