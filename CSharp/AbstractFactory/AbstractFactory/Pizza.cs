using AbstractFactory.Ingredients;

namespace AbstractFactory
{
    public class Pizza
    {
        private ICheese cheese;

        public Pizza(IPizzaRecipe recipe) {
            this.cheese = recipe.GetCheese();
        }

         public string GetAllIngredients() {
            return cheese.GetName();
         }
    }
}