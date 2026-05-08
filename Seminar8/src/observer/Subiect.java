package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    public List<IObservaPacient> observers;

    public Subiect() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(IObservaPacient observer) {
        this.observers.add(observer);
    }

    public void removeObserver(IObservaPacient observer) {
        this.observers.remove(observer);
    }

    public void printObservers() {
        this.observers.forEach(System.out::println);
    }
}
