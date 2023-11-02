package behaviors.inobject.observer;

import java.util.List;

public abstract class Subject {
    private List<Observer> observers;

    public Subject(List<Observer> observers) {
        this.observers = observers;
    }
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.remove(observer);
    }
    public void myNotify(){
        observers.forEach(x->x.update());
    }
}
