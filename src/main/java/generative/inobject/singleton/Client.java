package generative.inobject.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton.instance().setData("s");
        System.out.println(Singleton.instance().getData());
    }
}
