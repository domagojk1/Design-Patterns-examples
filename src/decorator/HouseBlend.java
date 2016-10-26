package decorator;

/**
 * Created by domagoj on 10/27/16.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double getCost() {
        return .89;
    }
}
