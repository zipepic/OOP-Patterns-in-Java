package structural.inclass.adapter.dual;

public class Adapter implements Target,Adaptee {
    private Target target;
    private Adaptee adaptee;

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    @Override
    public void specificRequest() {
        target.request();
    }
}
