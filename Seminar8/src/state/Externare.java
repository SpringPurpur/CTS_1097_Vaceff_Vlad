package state;

public class Externare implements Stari {
    @Override
    public void internare() {
        System.out.println("Va fi reinternat");
    }

    @Override
    public void trecereSubObservatie() {
        System.out.println("Nu poate fi pus sub observatie");
    }

    @Override
    public void externeaza() {
        System.out.println("Deja externat");
    }
}
