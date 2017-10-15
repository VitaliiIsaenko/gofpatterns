package patterns.state.states;

import patterns.state.GumballMachine;
import patterns.state.State;

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

    @Override
    public void refill(int count) {
        System.out.println("Gumball machine fully refilled!");
        gumballMachine.setCount(count);
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
