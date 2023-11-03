package behaviors.inobject.state;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }
    public void operation() {
        state.operation();
        changeState();
    }
    private void changeState() {
        if(this.state instanceof ConcreteStateB) {
            this.state = new ConcreteStateA();
        } else {
            this.state = new ConcreteStateB();
        }
    }
}
