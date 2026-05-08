package flyweight;

import java.util.HashMap;
import java.util.Map;

public class PacientFlyweightFactory {
    private static Map<String, Flyweight> flyweights = new HashMap<>();

    public static Flyweight getFlyweight(String nume, String nrTelefon, String adresa) {
        if (!flyweights.containsKey(nrTelefon)) {
            flyweights.put(nrTelefon, new PacientFlyweight(new Pacient(nume, nrTelefon, adresa)));
        }
        return flyweights.get(nrTelefon);
    }
}
