package behaviors.inobject.command;

public class ConcreteCommand extends Command{
    private String state;
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.work();
    }

    public String getState() {
        return state;
    }
}
