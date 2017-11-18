package patterns.proxy;

import java.rmi.Naming;

public class Program {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachineRemote = null;
        int count = 0;

        if (args.length < 2) {
            System.out.println("Gumball machine <name> <inventory>");
        }
        try {
            count = Integer.parseInt(args[1]);
            GumballMachine gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
            GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

            gumballMonitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
