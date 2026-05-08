package observer;

public class Main {
    public static void main(String[] args) {
        Pacient p1 = new Pacient("A");
        Pacient p2 = new Pacient("B");
        Pacient p3 = new Pacient("C");

        Spital spital = new Spital("GG");
        spital.addObserver(p1);
        spital.addObserver(p2);
        spital.addObserver(p3);
        spital.notificarePrimireVirusi("Covidelu");
    }
}
