package prototype.mutabletypes_02;

public class Solutie implements Cloneable {
    private String nume;
    private Double cantitate;
    
    public Solutie(String nume, Double cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    public void setCantitate(Double cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Solutie{");
        sb.append("nume=").append(nume);
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() {
        try {
            return (Solutie) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    
}
