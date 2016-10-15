package factoryMethod;

/**
 * Creator
 */
public interface Creator {
    public IConnection createConnection (String type);
}
