namespace AbstractFactory
{
    public class PepperoniRecipe : IPizzaRecipe
    {
        public ICheese GetCheese()
        {
            return new PepperoniCheese();
        }
    }
}