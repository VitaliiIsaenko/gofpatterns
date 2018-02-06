using Xunit;
using FactoryMethod;

namespace FactoryMethodTest
{
    public class PizzaMakerTest
    {
        [Fact]
        public void PreparePizzaPepperoni()
        {
            PizzaMaker pizzaMaker = new PepperoniMaker();
            Assert.Equal("Ingredients for Pepperoni", pizzaMaker.GetPizzaIngredients());
        }

                [Fact]
        public void PreparePizzaMargarita()
        {
            PizzaMaker pizzaMaker = new MargaritaMaker();
            Assert.Equal("Ingredients for Margarita", pizzaMaker.GetPizzaIngredients());
        }
    }
}
