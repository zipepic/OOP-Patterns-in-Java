package generative.inobject.abstractfactory;

public abstract class AbstractProductA {
    protected String arg;
    public abstract String make();

    public AbstractProductA(String arg) {
        this.arg = arg;
    }
}
