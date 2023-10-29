package structural.inobject.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    public abstract void operation();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int i);
}
