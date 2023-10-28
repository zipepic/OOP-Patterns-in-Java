package generative.inobject.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());

        System.out.println(director.construct());
    }
}
