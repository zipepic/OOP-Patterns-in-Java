package structural.inclass.adapter;

public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
