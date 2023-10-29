package generative.inobject.prototype;

public class ConcretePrototype1 extends Prototype{
    private String field;

    public ConcretePrototype1(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1(this.field);
        return prototype;
    }
}
