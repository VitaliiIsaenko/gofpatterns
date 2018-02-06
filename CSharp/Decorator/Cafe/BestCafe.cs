using System;

namespace Cafe
{
    public class BestCafe
    {
        public IHotDrink GetLatte()
        {
            return new Latte();
        }
    }
}
