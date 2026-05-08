package state;

public class Main {
    public static void main(String[] args) {
        Pacient p1 = new Pacient("A");
        System.out.println("Internat----------------");
        p1.interneaza();
        p1.subObservatie();
        p1.externeaza();
        System.out.println("Sub observatie----------------");
        p1.setStare(new SubObservatie());
        p1.interneaza();
        p1.subObservatie();
        p1.externeaza();
        System.out.println("Externat----------------");
        p1.setStare(new Externare());
        p1.interneaza();
        p1.subObservatie();
        p1.externeaza();
    }
}
