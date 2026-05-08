package memento;

public class AutobuzMemento {
    private String numeSofer;
    private double ConsumMediu;

    public AutobuzMemento(String numeSofer, double consumMediu) {
        this.numeSofer = numeSofer;
        ConsumMediu = consumMediu;
    }

    public AutobuzMemento() {
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public double getConsumMediu() {
        return ConsumMediu;
    }
}
