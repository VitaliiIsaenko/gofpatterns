namespace Cafe
{
    internal class StrawberrySyrup : SyrupDecorator
    {
        public StrawberrySyrup(IHotDrink hotDrink) : base(hotDrink)
        {
        }

        public override string Name => "Strawberry syrup";

        public override double CalculatePrice()
        {
            return hotDrink.CalculatePrice() + 1d;
        }
    }
}