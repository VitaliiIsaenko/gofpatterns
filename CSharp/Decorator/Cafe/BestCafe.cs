using System;
using System.Runtime.CompilerServices;

[assembly : InternalsVisibleTo ("CafeTest")]

namespace Cafe {
    public class BestCafe {
        public IHotDrink GetLatte () {
            return new Latte ();
        }

        public IHotDrink GetCapuccino () {
            return new Cappuccino ();
        }
    }
}