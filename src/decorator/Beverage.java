package decorator;

/**
 * Created by domagoj on 10/27/16.
 */
public abstract class Beverage {
    protected String description = "Unkown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
