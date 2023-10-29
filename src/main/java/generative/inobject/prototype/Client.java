package generative.inobject.prototype;

public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype1("field");
        ConcretePrototype1 clone = (ConcretePrototype1) prototype.clone();
        System.out.println(clone.getField());
    }
}
