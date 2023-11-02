package behaviors.inobject.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("state");
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.restoreMemento(caretaker.getMemento());
    }
}
