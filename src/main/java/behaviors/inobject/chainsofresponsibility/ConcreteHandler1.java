package behaviors.inobject.chainsofresponsibility;

public class ConcreteHandler1 extends Handler{
    public ConcreteHandler1(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("1 "+ message);
    }
}

