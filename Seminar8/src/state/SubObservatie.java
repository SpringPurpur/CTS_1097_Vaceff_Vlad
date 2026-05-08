package state;

public class SubObservatie implements Stari {
    @Override
    public void internare() {
        System.out.println("A iesit de sub observatie, doar internat");
    }

    @Override
    public void trecereSubObservatie() {
        System.out.println("Este deja sub observatie");
    }

    @Override
    public void externeaza() {
        System.out.println("Externeaza");
    }
}
