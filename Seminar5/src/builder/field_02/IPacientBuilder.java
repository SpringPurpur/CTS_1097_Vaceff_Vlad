package builder.field_02;

public interface IPacientBuilder {
    Pacient build();

    IPacientBuilder setNume(String nume);

    IPacientBuilder setArePatRabatabil(boolean arePatRabatabil);

    IPacientBuilder setAreMicDejunInclus(boolean areMicDejunInclus);

    IPacientBuilder setArePapuciDeCamera(boolean arePapuciDeCamera);

    IPacientBuilder setAreHalatPentruInterior(boolean areHalatPentruInterior);
}
