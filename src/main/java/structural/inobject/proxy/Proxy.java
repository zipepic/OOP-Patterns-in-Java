package structural.inobject.proxy;

public class Proxy implements Subject{
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void request() {
        subject.request();
    }
}
