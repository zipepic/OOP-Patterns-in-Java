package structural.inobject.decorator;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        ConcreteDecoratorB decorator = new ConcreteDecoratorB(component);
        decorator.addedBehavior();
        decorator.operation();
    }
}
