package generative.inobject.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    Product construct(){
        builder.buildPart();
        builder.buildA("A");
        builder.buildB("B");
        return builder.getProduct();
    }
}
