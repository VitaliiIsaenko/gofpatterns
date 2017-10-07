package patterns.command;

import patterns.command.commands.*;
import patterns.command.devices.CeilingFan;
import patterns.command.devices.Light;
import patterns.command.devices.Stereo;

public class Program {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Stereo stereo = new Stereo("Living room");
        CeilingFan ceilingFan = new CeilingFan();

        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        Command[] commandsOn = new Command[3];
        commandsOn[0] = lightOnCommand;
        commandsOn[1] = stereoOnWithCDCommand;
        commandsOn[2] = ceilingFanHighCommand;
        MacroCommand macroCommandOn = new MacroCommand(commandsOn);

        Command[] commandsOff = new Command[3];
        commandsOff[0] = lightOffCommand;
        commandsOff[1] = stereoOffWithCDCommand;
        commandsOff[2] = ceilingFanOffCommand;
        MacroCommand macroCommandOff = new MacroCommand(commandsOff);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffWithCDCommand);

        remoteControl.setCommand(2, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, ceilingFanHighCommand, ceilingFanOffCommand);

        remoteControl.setCommand(4, macroCommandOn, macroCommandOff);

        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();


    }
}
