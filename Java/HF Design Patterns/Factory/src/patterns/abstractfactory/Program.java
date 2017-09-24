package patterns.abstractfactory;

import patterns.abstractfactory.pizzas.Pizza;

public class Program {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.createPizza("cheese");
        pizza.prepare();
        pizza.box();

        pizzaStore = new ChicagoPizzaStore();
        pizza = pizzaStore.createPizza("cheese");
        pizza.prepare();
        pizza.box();
    }
}
