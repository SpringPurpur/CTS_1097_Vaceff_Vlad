package singleton.threadsafe;

public class BazaDeDateThreadSafe {
    private String denumire;
    private int numarCampuri;

    private static BazaDeDateThreadSafe instanta = null;

    public static synchronized BazaDeDateThreadSafe getInstanta(String denumire, int numarCampuri) {
        if (BazaDeDateThreadSafe.instanta == null) {
            BazaDeDateThreadSafe.instanta = new BazaDeDateThreadSafe(denumire, numarCampuri);
        }
        return BazaDeDateThreadSafe.instanta;
    }

    private BazaDeDateThreadSafe(String denumire, int numarCampuri) {
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
    }

    
}
