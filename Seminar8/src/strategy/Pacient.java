package strategy;

public class Pacient implements ModPlata {
    private String nume;
    private ModPlata modPlata;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                '}';
    }

    @Override
    public void plateste() {
        this.modPlata.plateste();
    }
}
