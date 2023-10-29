package generative.inobject.prototype;

public class ConcretePrototype2 extends Prototype{
    private Integer field;

    public ConcretePrototype2(Integer field) {
        this.field = field;
    }

    public Integer getField() {
        return field;
    }

    public void setField(Integer field) {
        this.field = field;
    }

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype2(this.field);
        return prototype;
    }
}
