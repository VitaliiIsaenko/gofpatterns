namespace Cafe
{
    internal class Latte : IHotDrink
    {
        public string Name => "Latte";

        public string Description => Name;

        public double CalculatePrice()
        {
            return 2d;
        }
    }
}