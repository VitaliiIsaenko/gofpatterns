namespace Cafe
{
    internal class BlueberrySyrup : SyrupDecorator
    {
        public BlueberrySyrup(IHotDrink hotDrink) : base(hotDrink)
        {
        }

        public override string Name => "Blueberry syrup";

        public override double CalculatePrice()
        {
            return hotDrink.CalculatePrice() + 3d;
        }
    }
}