package patterns.factorymethod;

import patterns.factorymethod.pizzas.*;

public class ChicagoStylePizzaStore extends PizzaStore {
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
