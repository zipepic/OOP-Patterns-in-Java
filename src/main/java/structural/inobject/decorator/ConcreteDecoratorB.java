package structural.inobject.decorator;

public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    public void addedBehavior(){
        System.out.println("new operation");
    }
}
