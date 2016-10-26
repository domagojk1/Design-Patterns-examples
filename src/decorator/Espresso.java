package decorator;

/**
 * Created by domagoj on 10/27/16.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}
