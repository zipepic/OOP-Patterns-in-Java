package generative.inobject.abstractfactory;

public class ConcreteProductA extends AbstractProductA{
    public ConcreteProductA(String arg) {
        super(arg);
    }

    @Override
    public String make() {
        return "ConcreteProductA with arg: " + arg;
    }
}
