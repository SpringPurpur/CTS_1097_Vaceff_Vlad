package command;

public class Internare extends Command {
    public Internare(String numePacient, Medic medic) {
        super(numePacient, medic);
    }

    @Override
    public void executa() {
        this.getMedic().internarePacient();
    }

    @Override
    public void undo() {
        this.getMedic().anuleazaInternarePacient();
    }

    @Override
    public void redo() {
        this.getMedic().refaceInternarePacient();
    }
}
