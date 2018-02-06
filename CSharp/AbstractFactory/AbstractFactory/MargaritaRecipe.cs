using AbstractFactory.Ingredients;
namespace AbstractFactory {
    public class MargaritaRecipe : IPizzaRecipe
    {
        public ICheese GetCheese()
        {
            return new MargaritaCheese();
        }
    }
}