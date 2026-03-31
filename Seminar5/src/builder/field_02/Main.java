package builder.field_02;

public class Main {

    public static void main(String[] args) {
        Pacient pacient1 = new PacientBuilder()
                .setNume("Matei")
                .setAreMicDejunInclus(true)
                .build();
        System.out.println(pacient1);

        Pacient pacient2 = new PacientBuilder()
                .setNume("Ionut")
                .setArePatRabatabil(true)
                .setAreMicDejunInclus(true)
                .setArePapuciDeCamera(true)
                .setAreHalatPentruInterior(true)
                .build();
        System.out.println(pacient2);

        PacientDirector director = new PacientDirector();

        Pacient pacientPremium = director.buildPacientPremium("Andreea");
        System.out.println(pacientPremium);

        Pacient pacientStandard = director.buildPacientStandard("Ioana");
        System.out.println(pacientStandard);
    }
}
