package structural.inobject.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> list;

    public Composite() {
        this.list = new ArrayList<>();
    }

    @Override
    public void operation() {
        list.forEach(x-> x.operation());
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }
}
