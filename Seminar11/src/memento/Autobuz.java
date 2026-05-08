package memento;

public class Autobuz {
    private String model;
    private int anFabricatie;
    private int nrLocuri;
    private String numeSofer;
    private double consumMediu;

    public Autobuz(String model, int anFabricatie, int nrLocuri, String numeSofer, double consumMediu) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }

    public AutobuzMemento salvareMemento() {
        return new AutobuzMemento(this.numeSofer, this.consumMediu);
    }

    public void restaurareMemento(AutobuzMemento am) {
        this.numeSofer = am.getNumeSofer();
        this.consumMediu = am.getConsumMediu();
    }
}
