package decorator;

/**
 * Created by domagoj on 10/27/16.
 */
public class Defac extends Beverage {
    public Defac() {
        description = "Decaf";
    }

    @Override
    public double getCost() {
        return 1.09;
    }
}
