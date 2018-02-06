namespace Cafe
{
    public abstract class SyrupDecorator : IHotDrink
    {
        
        protected IHotDrink hotDrink;

        public SyrupDecorator(IHotDrink hotDrink) {
            this.hotDrink = hotDrink;
        }

        public abstract string Name {get;}


        public string Description => hotDrink.Description + ", " + Name;

        public abstract double CalculatePrice();
    }
}