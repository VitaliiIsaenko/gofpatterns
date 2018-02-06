using Cafe;
using Xunit;

namespace CafeTest {
    public class HotDrinkTest {

        [Fact]
        public void GetCappuccinoPrice () {
            //Arrange
            IHotDrink cappuccino = new Cappuccino ();

            //Action
            double hotDrinkPrice = cappuccino.CalculatePrice ();

            //Assert
            Assert.Equal (3.50d, hotDrinkPrice);
        }

        [Fact]
        public void GetLattePrice () {
            //Arrange
            IHotDrink latte = new Latte ();

            //Action
            double hotDrinkPrice = latte.CalculatePrice ();

            //Assert
            Assert.Equal (2d, hotDrinkPrice);
        }

        [Fact]
        public void GetLatteDescription () {
            //Arrange
            IHotDrink latte = new Latte ();

            //Action
            string hotDrinkDescription = latte.Description;

            //Assert
            Assert.Equal ("Latte", hotDrinkDescription);

        }

        [Fact]
        public void GetLatteWithStrawberrySyrupDesctiption () {
            //Arrange
            IHotDrink latte = new Latte ();
            latte = new StrawberrySyrup (latte);

            //Action 
            string hotDrinkDesctiption = latte.Description;

            Assert.Equal ("Latte, Strawberry syrup", hotDrinkDesctiption);
        }

        [Fact]
        public void CalculatePriceOfLatteWithStrawberrySyrup () {
            //Arrange
            IHotDrink latte = new Latte ();
            latte = new StrawberrySyrup (latte);

            //Action 
            double hotDrinkCost = latte.CalculatePrice ();

            Assert.Equal (3d, hotDrinkCost);
        }

        [Fact]
        public void GetLatteWithBlueberrySyrupDesctiption () {
            //Arrange
            IHotDrink latte = new Latte ();
            latte = new BlueberrySyrup (latte);

            //Action 
            string hotDrinkDesctiption = latte.Description;

            Assert.Equal ("Latte, Blueberry syrup", hotDrinkDesctiption);
        }

                [Fact]
        public void CalculatePriceOfCapuccinoWithStrawberryAndBlueberrySyrup () {
            //Arrange
            IHotDrink cappuccino = new Cappuccino ();
            cappuccino = new StrawberrySyrup (cappuccino);
            cappuccino = new BlueberrySyrup(cappuccino);

            //Action 
            double hotDrinkCost =cappuccino.CalculatePrice ();

            Assert.Equal (7.5d, hotDrinkCost);
        }
    }
}