package patterns.proxy;

public class Program {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(3);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine.getCount() + gumballMachine.getState().toString());

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine.getCount() + gumballMachine.getState().toString());

    }
}
