package pizza;

public class StandardPizzaBase extends PizzaBase {

    public StandardPizzaBase(double baseCost) {
        super(baseCost);
    }

    @Override
    double costOfPizza() {
        return baseCost;
    }
}
