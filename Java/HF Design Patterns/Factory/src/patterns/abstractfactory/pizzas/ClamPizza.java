package patterns.abstractfactory.pizzas;

import patterns.abstractfactory.ingredientsfactories.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        clams = pizzaIngredientFactory.createClams();
    }
}
