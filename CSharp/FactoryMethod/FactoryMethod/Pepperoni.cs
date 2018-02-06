namespace FactoryMethod {
    public class Pepperoni : IPizza
    {
        public string GetIngredients()
        {
            return "Ingredients for Pepperoni";
        }
    }
}