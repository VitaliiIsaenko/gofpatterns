using AbstractFactory.Ingredients;

namespace AbstractFactory {
    public interface IPizzaRecipe {
        ICheese GetCheese ();
    }
}