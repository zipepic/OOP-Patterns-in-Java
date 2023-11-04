package behaviors.inobject.visitor;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Element> elements = List.of(new ConcreteElementA(), new ConcreteElementB());
        Visitor visitor = new ConcreteVisitor();
        elements.forEach(x-> x.accept(visitor));
    }
}
