package behaviors.inobject.mediator;

public class Client {
    public static void main(String[] args) {
        Colleague colleague = new ConcreteColleague();
        Mediator mediator = new ConcreteMediator(colleague);
        Worker worker = new Worker(mediator);
        worker.work();
    }
}
