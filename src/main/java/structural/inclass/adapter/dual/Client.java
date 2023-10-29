package structural.inclass.adapter.dual;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
        Adaptee adaptee = new Adapter();
        adaptee.specificRequest();
    }
}
