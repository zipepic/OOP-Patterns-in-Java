package behaviors.inobject.iterator;

public class ConcreteAggregate implements Aggregate{
    private Object[] objects;

    public ConcreteAggregate(Object[] objects) {
        this.objects = objects;
    }

    public Object[] getObjects() {
        return objects;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
