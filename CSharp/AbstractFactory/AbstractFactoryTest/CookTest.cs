using System;
using Xunit;
using AbstractFactory.Ingredients;

namespace AbstractFactoryTest
{
    public class CookTest   
    {
        [Fact]
        public void PrepareMargaritaPizza()
        {
            //Arrange
            Cook cook = new Cook();
            IPizzaRecipe margaritaRecipe = new MargaritaRecipe();

            //Action
            IPizza pizza = cook.preparePizza(margaritaRecipe);
            
            //Assert
            Assert.Equal(pizza.getAllIngredients, "Margarita cheese");
        }


    }
}
