package behaviors.inobject.mediator;

public class ConcreteMediator implements Mediator {
    private Colleague colleague;

    public ConcreteMediator(Colleague colleague) {
        this.colleague = colleague;
    }

    @Override
    public void operation() {
        colleague.operation();
    }
}
