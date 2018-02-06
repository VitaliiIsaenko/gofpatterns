using Xunit;
using AbstractFactory.Ingredients;
using AbstractFactory;


namespace AbstractFactoryTest {
    public class PizzaRecipeTest {
        [Fact]
        public void GetMargaritaCheese() {
            //Arrange
            IPizzaRecipe pizzaRecipe = new MargaritaRecipe();

            //Action
            ICheese cheese = pizzaRecipe.GetCheese();

            //Assert

            Assert.Equal("Margarita cheese",cheese.GetName());
        }

        [Fact]
        public void GetPepperoniCheese() {
            //Arrange
            IPizzaRecipe pizzaRecipe = new PepperoniRecipe();

            //Action
            ICheese cheese = pizzaRecipe.GetCheese();

            //Assert

            Assert.Equal("Pepperoni cheese",cheese.GetName());
        }
    }
}