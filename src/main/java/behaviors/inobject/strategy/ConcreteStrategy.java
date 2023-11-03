package behaviors.inobject.strategy;

public class ConcreteStrategy implements Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("ConcreteStrategy.algorithmInterface()");
    }
}
