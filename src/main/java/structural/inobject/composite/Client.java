package structural.inobject.composite;

public class Client {
    public static void main(String[] args) {
        Component component = new Composite();
        component.add(new Leaf());

        Component component1 = new Composite();
        component1.add(new Leaf());

        component.add(component1);

        component.operation();
    }
}
