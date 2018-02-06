using System;
using Xunit;

namespace CafeTest
{
    public class CafeTest
    {
        [Fact]
        public void GetLatteTest()
        {
            //Arrange
            BestCafe cafe = new BestCafe();

            //Action
            IHotDrink latte = cafe.GetLatte();
            string hotDrinkName = latte.Name;

            //Assert
            Assert.Equal(hotDrinkName, "Latte");
        }
    }
}
