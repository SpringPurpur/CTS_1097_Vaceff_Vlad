package builder.reference_01;

public class Pacient {

    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciDeCamera;
    private boolean areHalatPentruInterior;

    protected Pacient() {
        this.nume = "Anonim";
        this.arePatRabatabil = false;
        this.areMicDejunInclus = false;
        this.arePapuciDeCamera = false;
        this.areHalatPentruInterior = false;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    protected void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    protected void setAreHalatPentruInterior(boolean areHalatPentruInterior) {
        this.areHalatPentruInterior = areHalatPentruInterior;
    }

    @Override
    public String toString() {
        return "Pacient [nume=" + nume + ", arePatRabatabil=" + arePatRabatabil + ", areMicDejunInclus="
                + areMicDejunInclus + ", arePapuciDeCamera=" + arePapuciDeCamera + ", areHalatPentruInterior="
                + areHalatPentruInterior + "]";
    }
}