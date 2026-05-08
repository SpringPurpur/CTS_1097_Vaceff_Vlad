package flyweight;

public class Salon {
    private int nrSalon;
    private int nrPat;
    private int nrZileSpitalizare;

    public Salon(int nrSalon, int nrPat, int nrZileSpitalizare) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "nrSalon=" + nrSalon +
                ", nrPat=" + nrPat +
                ", nrZileSpitalizare=" + nrZileSpitalizare +
                '}';
    }
}
