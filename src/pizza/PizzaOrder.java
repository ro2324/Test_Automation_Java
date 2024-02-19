package pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {

    private PizzaBase pizzaBase;
    private List<PizzaToppings> pizzaToppingsList;

    // Add topping to the pizza
    public PizzaOrder(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
        this.pizzaToppingsList = new ArrayList<>();
    }

    public void addPizzaToppings(PizzaToppings pizzaToppings) {
        pizzaToppingsList.add(pizzaToppings);
    }

    // Calculate total cost of the pizza with toppings
    public double calculateTotalCost() {

        double totalCost = pizzaBase.costOfPizza();

        for (PizzaToppings pizzaToppings : pizzaToppingsList) {
            totalCost += pizzaToppings.getCost();
        }
        return totalCost;
    }
}
