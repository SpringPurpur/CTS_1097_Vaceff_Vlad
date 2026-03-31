package prototype.mutabletypes_02;

import java.util.List;

import prototype.mutabletypes_02.RetetaMedicament;
import prototype.mutabletypes_02.Solutie;

public class Main {

    public static void main(String[] args) {
        RetetaMedicament retetaMedicament = new RetetaMedicament("Medicament-01",
                List.of(new Solutie("Solutie-01", 10.1),
                        new Solutie("Solutie-02", 20.2),
                        new Solutie("Solutie-03", 30.3)));
        RetetaMedicament clonaRetetaMedicament = (RetetaMedicament) retetaMedicament.cloneaza();

        System.out.println(retetaMedicament);
        System.out.println(clonaRetetaMedicament);
        System.out.println(retetaMedicament == clonaRetetaMedicament);

        clonaRetetaMedicament.getSolutii().getFirst().setCantitate(50.0);
        System.out.println(retetaMedicament);
        System.out.println(clonaRetetaMedicament);
    }
}
