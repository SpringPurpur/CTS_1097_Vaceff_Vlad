package builderV2;

public class BuilderPacient implements IBuilderPacient {
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciCamera;
    private boolean areHalat;
    private String nume;

    public BuilderPacient() {
        this.arePatRabatabil = false;
        this.areMicDejun = false;
        this.arePapuciCamera = false;
        this.areHalat = false;
        this.nume = "N/A";
    }

    @Override
    public Pacient buildPacient() {
        return new Pacient(this.arePatRabatabil,
                           this.areMicDejun,
                           this.arePapuciCamera,
                           this.areHalat,
                           this.nume);
    }

    @Override
    public IBuilderPacient setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    @Override
    public IBuilderPacient setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    @Override
    public IBuilderPacient setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
        return this;
    }

    @Override
    public IBuilderPacient setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }

    @Override
    public IBuilderPacient setNume(String nume) {
        this.nume = nume;
        return this;
    }
}
