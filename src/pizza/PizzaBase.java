package pizza;

abstract class PizzaBase {

    protected double baseCost;

    public PizzaBase(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getBaseCost() {
        return baseCost;
    }

    // Abstract method to calculate cost of pizza
    abstract double costOfPizza();
}
