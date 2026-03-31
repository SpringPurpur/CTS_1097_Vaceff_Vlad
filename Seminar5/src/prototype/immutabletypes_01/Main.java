package prototype.immutabletypes_01;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        RetetaMedicament retetaMedicament = new RetetaMedicament("Medicament-01",
                Map.of("Solutie-01", 10.1,
                        "Solutie-02", 20.2,
                        "Solutie-03", 30.3));
        RetetaMedicament clonaRetetaMedicament = (RetetaMedicament) retetaMedicament.cloneaza();

        System.out.println(retetaMedicament);
        System.out.println(clonaRetetaMedicament);
        System.out.println(retetaMedicament == clonaRetetaMedicament);

        clonaRetetaMedicament.getSolutii().put("Solutie-01", 50.0);
        System.out.println(retetaMedicament);
        System.out.println(clonaRetetaMedicament);
    }
}
