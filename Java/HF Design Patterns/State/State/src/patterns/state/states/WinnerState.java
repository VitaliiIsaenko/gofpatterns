package patterns.state.states;

import patterns.state.GumballMachine;
import patterns.state.State;

public class WinnerState implements State {
    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Too late");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No money was paid");
    }

    @Override
    public void turnCrank() {
        System.out.println("You've already turned the crank once!");
    }

    @Override
    public void dispense() {
        System.out.println("You are a winner! Get 2 instead of 1!");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill(int count) {
        System.out.println("No need to refill");
    }
}
