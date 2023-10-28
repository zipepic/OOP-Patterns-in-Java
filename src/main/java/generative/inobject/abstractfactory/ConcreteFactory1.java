package generative.inobject.abstractfactory;

public class ConcreteFactory1 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA(String arg) {
        return new ConcreteProductA(arg);
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB();
    }
}
