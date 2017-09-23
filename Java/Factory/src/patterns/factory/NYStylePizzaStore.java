package patterns.factory;

import patterns.common.pizzas.NYStyleCheesePizza;
import patterns.common.pizzas.NYStylePepperoniPizza;
import patterns.common.pizzas.Pizza;

public class NYStylePizzaStore extends FPizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza();
                break;
        }
        return pizza;
    }
}
