package flyweight;

public class Pacient {
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Pacient(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}
