package command;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public void internarePacient() {
        System.out.println("Internare pacient");
    }

    public void internareImediata() {
        System.out.println("Internare imediata");
    }

    public String getNume() {
        return nume;
    }

    public void anuleazaInternarePacient() {
        System.out.println("X");
    }

    public void anuleazaInternareImediata() {
        System.out.println("X");
    }

    public void refaceInternarePacient() {
        System.out.println("X");
    }

    public void refaceInternareImediata() {
        System.out.println("X");
    }
}
