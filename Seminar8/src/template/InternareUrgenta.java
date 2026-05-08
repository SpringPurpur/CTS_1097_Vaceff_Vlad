package template;

public class InternareUrgenta extends InternareTemplateMethod {
    @Override
    void analizareStarePacient() {
        System.out.println("Analiza urg");
    }

    @Override
    void disponibilitateSaloane() {
        System.out.println("Disponibil urg");
    }

    @Override
    void fisaInternare() {
        System.out.println("Fisa urg");
    }
}
