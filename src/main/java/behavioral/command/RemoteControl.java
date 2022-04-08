package behavioral.command;

public class RemoteControl {
    Command button1Command;
    Command button2Command;
    Command button3Command;

    public void setCommand1(Command command) {
        button1Command = command;
    }

    public void setCommand2(Command command) {
        button2Command = command;
    }

    public void setCommand3(Command command) {
        button3Command = command;
    }

    public void pressButton1() {
        button1Command.execute();
    }

    public void pressButton2() {
        button2Command.execute();
    }

    public void pressButton3() {
        button3Command.execute();
    }
}
