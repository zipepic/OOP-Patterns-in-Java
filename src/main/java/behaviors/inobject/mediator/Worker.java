package behaviors.inobject.mediator;

public class Worker {
    private Mediator mediator;

    public Worker(Mediator mediator) {
        this.mediator = mediator;
    }

    public void work(){
        mediator.operation();
    }
}
