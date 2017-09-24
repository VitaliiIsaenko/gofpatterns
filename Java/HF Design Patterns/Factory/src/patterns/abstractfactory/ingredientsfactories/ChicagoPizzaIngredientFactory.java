package patterns.abstractfactory.ingredientsfactories;

import patterns.abstractfactory.ingredients.*;
import patterns.abstractfactory.ingredients.chicagoingredients.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozarella();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
