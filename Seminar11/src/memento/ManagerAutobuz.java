package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuz {
    private List<AutobuzMemento> mementos = new ArrayList<>();

    public void adaugaMemento(AutobuzMemento am) {
        mementos.add(am);
    }

    public AutobuzMemento getMemento (int index) {
        return mementos.get(index);
    }

    public AutobuzMemento getLastMemento() {
        return mementos.getLast();
    }
}
