package observer;

public class Spital extends Subiect {
    private String numeSpital;

    public Spital(String numeSpital) {
        super();
        this.numeSpital = numeSpital;
    }

    public void notificarePrimireVirusi(String virus) {
        this.observers.forEach(o ->
                o.primesteNotificare(virus)
        );
    }
}
