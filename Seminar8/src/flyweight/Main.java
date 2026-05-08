package flyweight;

public class Main {
    public static void main(String[] args) {
        Salon s1 = new Salon(1, 1, 1);
        Salon s2 = new Salon(2, 2, 2);
        Salon s3 = new Salon(3, 3, 3);

//        Pacient p1 = new Pacient("A", "000", "ABC");
//        Pacient p2 = new Pacient("B", "111", "DEF");
//        Pacient p3 = new Pacient("C", "111", "GHI");

        PacientFlyweightFactory.getFlyweight("A", "000", "ABC").afisareDetaliiInternare(s1);
            PacientFlyweightFactory.getFlyweight("B", "111", "DEF").afisareDetaliiInternare(s2);
            PacientFlyweightFactory.getFlyweight("C", "111", "GHI").afisareDetaliiInternare(s3);
    }
}
