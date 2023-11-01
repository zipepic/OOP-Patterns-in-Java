package behaviors.inobject.command;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
        command.execute();
    }
}
