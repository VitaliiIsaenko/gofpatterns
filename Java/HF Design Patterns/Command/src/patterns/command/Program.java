package patterns.command;

public class Program {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        LightOnCommand lightOnCommand = new LightOnCommand(new Light());
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());
        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();
    }
}
