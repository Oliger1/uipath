package behavioral.command;

import java.rmi.Remote;

public class RemoteControlClient {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        TV tv = new TV();

        remoteControl.setCommand1(new LightOnCommand(light));
        remoteControl.setCommand2(new LightOffCommand(light));
        remoteControl.setCommand3(new TvOnCommand(tv));
        remoteControl.pressButton1();
        remoteControl.pressButton2();
        remoteControl.pressButton3();

        remoteControl.setCommand1(new TvOffCommand(tv));
        remoteControl.setCommand2(new GarageDoorUpCommand(garageDoor));
        remoteControl.setCommand3(new GarageDoorDownCommand(garageDoor));

        remoteControl.pressButton1();
        remoteControl.pressButton2();
        remoteControl.pressButton3();

    }
}
