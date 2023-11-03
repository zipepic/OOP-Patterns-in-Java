package behaviors.inobject.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());

        context.operation();
        context.operation();
        context.operation();
    }
}
