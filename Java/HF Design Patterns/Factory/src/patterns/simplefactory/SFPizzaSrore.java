package patterns.simplefactory;

import patterns.common.pizzas.Pizza;

public class SFPizzaSrore {
    private SimplePizzaFactory factory;

    public SFPizzaSrore(SimplePizzaFactory simplePizzaFactory){
        this.factory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
