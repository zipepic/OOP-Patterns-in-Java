package behaviors.inobject.iterator;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate(new Object[]{1, 2, 3,4,62,1});
        Iterator iterator = concreteAggregate.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
