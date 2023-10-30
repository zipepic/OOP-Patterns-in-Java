package structural.inobject.facade;

public class Facade {
    private ProductA productA;
    private ProductB productB;
    private ProductC productC;
    public void operation() {
        ProductA productA = new ProductA();
        ProductB productB = new ProductB();
        ProductC productC = new ProductC();
        productA.operation();
        productB.operation();
        productC.operation();
    }
}
