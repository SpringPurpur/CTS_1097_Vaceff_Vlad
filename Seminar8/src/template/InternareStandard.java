package template;

public class InternareStandard extends InternareTemplateMethod {
    @Override
    void analizareStarePacient() {
        System.out.println("Analiza std");
    }

    @Override
    void disponibilitateSaloane() {
        System.out.println("Disponibil std");
    }

    @Override
    void fisaInternare() {
        System.out.println("Fisa std");
    }
}
