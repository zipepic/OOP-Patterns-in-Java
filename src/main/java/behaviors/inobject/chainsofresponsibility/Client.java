package behaviors.inobject.chainsofresponsibility;

public class Client {
    public static void main(String[] args) {
        Handler handler = new ConcreteHandler1(1);
        handler.setNextHandler(new ConcreteHandler2(2));
        handler.handleRequest("hi", 2);
    }
}
