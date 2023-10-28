package generative.inobject.builder;

public abstract class Builder {
    protected Product product;
    public void buildPart(){
        product = new Product();
    }
    public abstract void buildA(String a);
    public abstract void buildB(String b);
    public Product getProduct(){
        return product;
    }
}
