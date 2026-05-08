package observer;

public class Pacient implements IObservaPacient {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume + " a fost notificat de " + mesaj);
    }
}
