package patterns.simplefactory;

import patterns.simplefactory.pizzas.CheesePizza;
import patterns.simplefactory.pizzas.PepperoniPizza;
import patterns.simplefactory.pizzas.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type){
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
        }
        return pizza;
    }
}
