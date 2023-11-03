package behaviors.inobject.strategy;

public class Client {
    public static void main(String[] args) {
        ConcreteStrategy concreteStrategy = new ConcreteStrategy();
        Context context = new Context();
        context.setStrategy(concreteStrategy);
        context.contextInterface();
    }
}
