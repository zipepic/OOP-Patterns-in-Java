package structural.inobject.flyweight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight = factory.getFlyweight("concrete");
        flyweight.operation("state");
    }
}
