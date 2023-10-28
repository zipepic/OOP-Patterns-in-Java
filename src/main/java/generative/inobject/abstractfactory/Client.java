package generative.inobject.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory2();
        AbstractProductA productA = factory.createProductA("arg1");
        AbstractProductB productB = factory.createProductB();
        System.out.println(productA.make());
        System.out.println(productB.doSomething());
    }
}
