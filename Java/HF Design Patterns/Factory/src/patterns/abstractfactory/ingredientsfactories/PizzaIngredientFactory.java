package patterns.abstractfactory.ingredientsfactories;

import patterns.abstractfactory.ingredients.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClams();
}
