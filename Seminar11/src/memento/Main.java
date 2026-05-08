package memento;

public class Main {
    public static void main(String[] args) {
        Autobuz a = new Autobuz("A", 1983, 40, "Peda Lazar", 20.0);

        System.out.println(a);

        AutobuzMemento am = a.salvareMemento();

        a.restaurareMemento(am);


    }
}
