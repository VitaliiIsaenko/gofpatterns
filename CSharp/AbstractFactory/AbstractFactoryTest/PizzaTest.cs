using System;
using Xunit;
using AbstractFactory.Ingredients;
using AbstractFactory;

namespace AbstractFactoryTest
{
    public class PizzaTest   
    {
        [Fact]
        public void PrepareMargaritaPizza()
        {
            //Arrange
            IPizzaRecipe margaritaRecipe = new MargaritaRecipe();
            Pizza pizza = new Pizza(margaritaRecipe);
            
            //Action
            var allIngredientsActual = pizza.GetAllIngredients();

            //Assert
            Assert.Equal("Margarita cheese", allIngredientsActual);
        }


    }
}
