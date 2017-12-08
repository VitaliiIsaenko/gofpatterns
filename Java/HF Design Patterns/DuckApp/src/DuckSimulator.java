import birds.*;
import patterns.*;
import patterns.abstractfactory.AbstractDuckFactory;
import patterns.abstractfactory.CountingDuckFactory;
import patterns.adapter.GooseAdapter;
import patterns.composite.Flock;
import patterns.decorator.QuackCounter;
import patterns.observer.Quackologist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable readheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("Duck simulator: with composite - Flocks");

        Flock flocksOfDucks = new Flock();
        flocksOfDucks.add(readheadDuck);
        flocksOfDucks.add(duckCall);
        flocksOfDucks.add(rubberDuck);
        flocksOfDucks.add(gooseDuck);

        Flock flocksOfMallardDucks = new Flock();
        flocksOfMallardDucks.add(duckFactory.createMallardDuck());
        flocksOfMallardDucks.add(duckFactory.createMallardDuck());
        flocksOfMallardDucks.add(duckFactory.createMallardDuck());
        flocksOfMallardDucks.add(duckFactory.createMallardDuck());

        flocksOfDucks.add(flocksOfMallardDucks);

        System.out.println("Duck simulator: whole flock simulation");
        simulate(flocksOfDucks);

        System.out.println("Duck simulator: mallard flock simulation");
        simulate(flocksOfMallardDucks);

        System.out.println(QuackCounter.getNumberOfQuacks());

        System.out.println("Duck simulator: with observer");
        Quackologist quackologist = new Quackologist();
        flocksOfDucks.registerObserver(quackologist);

        simulate(flocksOfDucks);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
