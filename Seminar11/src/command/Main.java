package command;

public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic("FHAGOO");
        OperatorTriaj ot = new OperatorTriaj();
        ot.adaugaComanda(new Internare("ABC", medic));
        ot.adaugaComanda(new InternareImediata("HDAG", medic));

        ot.trimiteComanda();
        ot.trimiteComanda();
        ot.trimiteComanda();
    }
}
