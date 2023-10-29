package structural.inobject.composite;

public class Leaf extends Component{
    @Override
    public void operation() {
        System.out.println("operation Leaf");
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int i) {
        throw new UnsupportedOperationException();
    }
}
