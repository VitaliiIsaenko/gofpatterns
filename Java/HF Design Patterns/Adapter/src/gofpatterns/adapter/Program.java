package gofpatterns.adapter;

public class Program {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("Turkey: ");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("Duck: ");
        testDuck(mallardDuck);

        System.out.println("TurkeyAdapter: ");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
