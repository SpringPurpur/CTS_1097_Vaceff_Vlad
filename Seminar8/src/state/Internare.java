package state;

public class Internare implements Stari {
    @Override
    public void internare() {
        System.out.println("Deja internat");
    }

    @Override
    public void trecereSubObservatie() {
        System.out.println("Trecere sub observatie...");
    }

    @Override
    public void externeaza() {
        System.out.println("Externare...");
    }
}
