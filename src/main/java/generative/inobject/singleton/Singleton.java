package generative.inobject.singleton;

public class Singleton {
    private static Singleton instance;
    private String data;
    protected Singleton() {
    }
    public static synchronized Singleton instance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
