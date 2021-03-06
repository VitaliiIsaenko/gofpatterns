package patterns.factorymethod;

import patterns.factorymethod.pizzas.*;

public class NYStylePizzaStore extends PizzaStore {
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
