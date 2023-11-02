package behaviors.inobject.observer;

import java.util.List;

public class ConcreteSubject extends Subject{
    private String state;

    public ConcreteSubject(List<Observer> observers) {
        super(observers);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        myNotify();
    }
}
