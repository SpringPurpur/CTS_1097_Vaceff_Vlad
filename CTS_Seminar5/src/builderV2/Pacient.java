package builderV2;

public class Pacient {
    private final boolean arePatRabatabil;
    private final boolean areMicDejun;
    private final boolean arePapuciCamera;
    private final boolean areHalat;
    private final String nume;

    protected Pacient(boolean arePatRabatabil, boolean areMicDejun, boolean arePapuciCamera, boolean areHalat, String nume) {
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalat = areHalat;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "arePatRabatabil=" + arePatRabatabil +
                ", areMicDejun=" + areMicDejun +
                ", arePapuciCamera=" + arePapuciCamera +
                ", areHalat=" + areHalat +
                ", nume='" + nume + '\'' +
                '}';
    }
}
