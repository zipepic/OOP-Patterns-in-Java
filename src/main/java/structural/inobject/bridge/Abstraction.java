package structural.inobject.bridge;

public abstract class Abstraction {
    private Implementator implementator;

    public Abstraction(Implementator implementator) {
        this.implementator = implementator;
    }

    public void operation() {
        implementator.operationImp();
    }
}
