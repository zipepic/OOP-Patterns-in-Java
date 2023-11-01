package behaviors.inobject.chainsofresponsibility;

public class ConcreteHandler2 extends Handler{
    public ConcreteHandler2(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("2 "+ message);
    }
}