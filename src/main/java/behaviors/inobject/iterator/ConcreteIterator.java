package behaviors.inobject.iterator;

import behaviors.inobject.command.Invoker;

public class ConcreteIterator implements Iterator{
    private ConcreteAggregate aggregate;
    int index = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getObjects()[0];
    }

    @Override
    public Object next() {
        return aggregate.getObjects()[index++];
    }

    @Override
    public boolean isDone() {
        return index >= aggregate.getObjects().length;
    }

    @Override
    public Object currentItem() {
        return aggregate.getObjects()[index];
    }
}
