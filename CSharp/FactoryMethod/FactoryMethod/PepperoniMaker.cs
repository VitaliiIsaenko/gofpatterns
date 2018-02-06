namespace FactoryMethod{
    public class PepperoniMaker : PizzaMaker
    {
        public override IPizza CreatePizza()
        {
            return new Pepperoni();
        }
    }
}