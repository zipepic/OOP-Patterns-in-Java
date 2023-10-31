package structural.inclass.adapter;

public class AdapterB implements Target{
    private Adaptee adaptee;

    public AdapterB(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
