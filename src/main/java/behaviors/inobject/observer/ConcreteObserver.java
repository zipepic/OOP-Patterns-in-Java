package behaviors.inobject.observer;

public class ConcreteObserver implements Observer{
    private ConcreteSubject subject;
    private String observerState;
    @Override
    public void update() {
        observerState = subject.getState();
    }

    public String getObserverState() {
        return observerState;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
