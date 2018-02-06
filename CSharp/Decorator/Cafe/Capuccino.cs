namespace Cafe
{
    internal class Capuccino : IHotDrink
    {
        public string Name => "Cappuccino";

        public double CalculatePrice()
        {
            return 3.50d;
        }
    }
}