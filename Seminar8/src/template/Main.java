package template;

public class Main {
    public static void main(String[] args) {
        InternareTemplateMethod std = new InternareStandard();
        InternareTemplateMethod urg = new InternareUrgenta();
        std.internare();
        urg.internare();
    }
}
