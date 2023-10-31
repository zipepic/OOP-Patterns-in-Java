package structural.inobject.flyweight;

public class ConcreteFlyweight extends Flyweight{
    private String intrinsicState;
    @Override
    public void operation(String state) {
        this.intrinsicState = state;
        System.out.println("ConcreteFlyweight.operation()");
    }
}
