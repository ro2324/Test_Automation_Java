package pizza;

public class SoftPizzaBase extends PizzaBase {
    public SoftPizzaBase(double baseCost) {
        super(baseCost);
    }

    @Override
    double costOfPizza() {
        return baseCost;
    }
}
