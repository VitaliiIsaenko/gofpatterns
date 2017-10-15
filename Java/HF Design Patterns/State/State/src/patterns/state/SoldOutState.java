package patterns.state;

public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, there are no more gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You didn't put any money");
    }

    @Override
    public void turnCrank() {
        System.out.println("You didn't put a quarter");
    }

    @Override
    public void dispense() {
        System.out.println("There are no gumballs anymore");
    }
}
