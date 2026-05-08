package command;

public class InternareImediata extends Command {
    public InternareImediata(String numePacient, Medic medic) {
        super(numePacient, medic);
    }

    @Override
    public void executa() {
        this.getMedic().internareImediata();
    }

    @Override
    public void undo() {
        this.getMedic().anuleazaInternareImediata();
    }

    @Override
    public void redo() {
        this.getMedic().refaceInternareImediata();
    }
}
