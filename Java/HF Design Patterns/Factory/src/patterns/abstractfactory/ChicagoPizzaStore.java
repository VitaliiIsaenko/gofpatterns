package patterns.abstractfactory;

import patterns.abstractfactory.ingredientsfactories.ChicagoPizzaIngredientFactory;
import patterns.abstractfactory.ingredientsfactories.PizzaIngredientFactory;
import patterns.abstractfactory.pizzas.CheesePizza;
import patterns.abstractfactory.pizzas.ClamPizza;
import patterns.abstractfactory.pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type){
            case "cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                break;
            case "clam":
                pizza = new ClamPizza(pizzaIngredientFactory);
                break;
        }
        return pizza;
    }
}
