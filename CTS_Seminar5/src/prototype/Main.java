package prototype;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RetetaMedicament retetaMedicament = new RetetaMedicament(
                "Diazepam",
                Map.of("NaCl", 120D, "H2C2O2", 30D)
        );
        RetetaMedicament copieRetetaMedicament = (RetetaMedicament) retetaMedicament.cloneazaReteta();
    }
}
