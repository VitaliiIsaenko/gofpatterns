namespace Cafe
{
    public interface IHotDrink
    {
        string Name{get;}
        string Description { get; }

        double CalculatePrice();
    }
}