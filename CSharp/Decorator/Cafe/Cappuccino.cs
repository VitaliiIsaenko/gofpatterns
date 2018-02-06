namespace Cafe
{
    internal class Cappuccino : IHotDrink
    {
        public string Name => "Cappuccino";

        public string Description => Name;

        public double CalculatePrice()
        {
            return 3.50d;
        }
    }
}