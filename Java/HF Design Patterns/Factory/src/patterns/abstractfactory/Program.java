package patterns.abstractfactory;

import patterns.abstractfactory.pizzas.Pizza;

public class Program {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");

        pizzaStore = new ChicagoPizzaStore();
        pizza = pizzaStore.orderPizza("cheese");
    }
}
