package structural.inobject.bridge;

public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new ConcreteAbstraction(new ConcreteImplementator());
        abstraction.operation();
    }
}
