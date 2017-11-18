package patterns.proxy;

import java.rmi.RemoteException;

public class GumballMonitor {
    private GumballMachineRemote gumballMachineRemote;

    public GumballMonitor(GumballMachineRemote gumballMachineRemote){
        this.gumballMachineRemote = gumballMachineRemote;
    }

    public void report() {
        try {
            System.out.println(gumballMachineRemote.getLocation());
            System.out.println(gumballMachineRemote.getCount());
            System.out.println(gumballMachineRemote.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
