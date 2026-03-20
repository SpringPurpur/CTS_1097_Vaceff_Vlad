package builderV2;

public class Main {
    public static void main(String[] args) {
        IBuilderPacient builderPacient = new BuilderPacient();
        Pacient pacient = builderPacient.setNume("Matei").setAreHalat(true).setAreMicDejun(true).buildPacient();
        System.out.println(pacient);
        Pacient pacient1 = builderPacient.setNume("Ion").setArePapuciCamera(true).setArePatRabatabil(true).buildPacient();
        System.out.println(pacient1);
    }
}