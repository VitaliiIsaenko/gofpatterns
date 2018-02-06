using System;
using Cafe;
using Xunit;

namespace CafeTest
{
    public class CafeTest
    {
        [Fact]
        public void GetLatte()
        {
            //Arrange
            BestCafe cafe = new BestCafe();

            //Action
            IHotDrink latte = cafe.GetLatte();
            string hotDrinkName = latte.Name;

            //Assert
            Assert.Equal(hotDrinkName, "Latte");
        }

        [Fact] 
        public void GetCapuccino(){
            //Arrange 
            BestCafe cafe = new BestCafe();

            //Action
            IHotDrink capuccino = cafe.GetCapuccino();
            string hotDrinkName = capuccino.Name;

            //Assert
            Assert.Equal(hotDrinkName, "Cappuccino");
        }

        [Fact]
        public void GetHotDrinkPrice(){
            //Arrange
            BestCafe cafe = new BestCafe();
            IHotDrink cappuccino = cafe.GetCapuccino();

            //Action
            double hotDrinkPrice = cappuccino.CalculatePrice();

            //Assert
            Assert.Equal(hotDrinkPrice, 3.50d);

        }
    }
}
