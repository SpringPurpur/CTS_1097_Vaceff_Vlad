package state;

public class Pacient {
    private String nume;
    private Stari stare;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new Internare();
    }

    public void setStare(Stari stare) {
        this.stare = stare;
    }

    public void interneaza() {
        this.stare.internare();
        this.setStare(new Internare());
    }

    public void subObservatie() {
        this.stare.trecereSubObservatie();
        this.setStare(new SubObservatie());
    }

    public void externeaza() {
        this.stare.externeaza();
        this.setStare(new Externare());
    }
}
