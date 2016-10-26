package decorator;

/**
 * Created by domagoj on 10/27/16.
 */
public class SteamedMilk extends CondimentDecorator {
    private Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + .10;
    }
}
