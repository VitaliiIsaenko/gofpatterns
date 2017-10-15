package patterns.proxy;

public class GumballMonitor {
    private GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println(gumballMachine.getLocation());
        System.out.println(gumballMachine.getCount());
        System.out.println(gumballMachine.getState());
    }
}
