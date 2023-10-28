package generative.inobject.builder;

public class ConcreteBuilder extends Builder{
    @Override
    public void buildA(String a) {
        product.setFieldA(a);
    }

    @Override
    public void buildB(String b) {
        product.setFieldB(b);
    }
}
