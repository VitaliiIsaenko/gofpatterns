using System;

namespace FactoryMethod
{
    public abstract class PizzaMaker
    {
        public string GetPizzaIngredients() {
            IPizza pizza = CreatePizza();
            return pizza.GetIngredients();
        }

        public abstract IPizza CreatePizza();
    }
}
