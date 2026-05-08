package command;

import java.util.*;

public class OperatorTriaj {
    private Queue<Command> comenzi = new LinkedList<>();
    private Stack<Command> undo = new Stack<>();
    private Stack<Command> redo = new Stack<>();

    public void trimiteComanda() {
        if (!comenzi.isEmpty()) {
            Command c = this.comenzi.poll();
            c.executa();
            undo.push(c);
        }
        else {
            System.out.println("Nu mai exista comenzi");
        }
    }

    public void anuleazaComanda() {
        if (!comenzi.isEmpty()) {
            Command c = this.undo.pop();
            c.executa();
            redo.push(c);
        }
        else {
            System.out.println("Nu mai exista comenzi");
        }
    }

    public void refaceComanda() {
        if (!comenzi.isEmpty()) {
            Command c = this.redo.pop();
            c.executa();
            undo.push(c);
        }
        else {
            System.out.println("Nu mai exista comenzi");
        }
    }

    public void adaugaComanda(Command c) {
        this.comenzi.add(c);
    }
}
