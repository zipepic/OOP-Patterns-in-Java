package behaviors.inobject.observer;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        ConcreteObserver concreteObserver = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject(List.of(concreteObserver));
        concreteObserver.setSubject(subject);
        System.out.println(concreteObserver.getObserverState());
        subject.setState("test");
        System.out.println(concreteObserver.getObserverState());
    }
}
