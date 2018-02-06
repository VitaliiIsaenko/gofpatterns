namespace FactoryMethod {
    public class MargaritaMaker : PizzaMaker
    {
        public override IPizza CreatePizza()
        {
            return new Margarita();
        }
    }
}