using System;
using Cafe;
using Xunit;

namespace CafeTest {
    public class CafeTest {
        [Fact]
        public void GetLatte () {
            //Arrange
            BestCafe cafe = new BestCafe ();

            //Action
            IHotDrink latte = cafe.GetLatte ();
            string hotDrinkName = latte.Name;

            //Assert
            Assert.Equal ("Latte",hotDrinkName);
        }

        [Fact]
        public void GetCapuccino () {
            //Arrange 
            BestCafe cafe = new BestCafe ();

            //Action
            IHotDrink capuccino = cafe.GetCapuccino ();
            string hotDrinkName = capuccino.Name;

            //Assert
            Assert.Equal ("Cappuccino",hotDrinkName);
        }

    }
}