package patterns.factory;

import patterns.common.pizzas.*;

public class ChicagoStylePizzaStore extends FPizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new ChicagoStylePepperoniPizza();
                break;
        }
        return pizza;
    }
}
