package patterns.command.commands;

import patterns.command.devices.CeilingFan;

public class CeilingFanOff implements Command {
    private final CeilingFan ceilingFan;

    public CeilingFanOff(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        
    }

    @Override
    public void undo() {

    }
}
