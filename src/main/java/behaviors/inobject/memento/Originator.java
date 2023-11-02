package behaviors.inobject.memento;

public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }
    public void restoreMemento(Memento memento) {
        state = memento.getState();
    }
}
