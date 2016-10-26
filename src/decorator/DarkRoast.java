package decorator;

/**
 * Created by domagoj on 10/27/16.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double getCost() {
        return .99;
    }
}
