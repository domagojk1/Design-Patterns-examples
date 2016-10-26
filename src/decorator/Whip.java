package decorator;

/**
 * Created by domagoj on 10/27/16.
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + .10;
    }
}
