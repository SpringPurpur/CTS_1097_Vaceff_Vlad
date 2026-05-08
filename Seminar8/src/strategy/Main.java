package strategy;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Mihai");
        pacient.setModPlata(new PlataCard());
        pacient.plateste();

        Pacient pacient2 = new Pacient("Jorj");
        pacient2.setModPlata(new PlataCash());
        pacient2.plateste();
    }
}
