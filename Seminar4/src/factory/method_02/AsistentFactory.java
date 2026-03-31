package factory.method_02;

public class AsistentFactory extends PersonalSpitalFactoryMethod {
    @Override
    public PersonalSpital getPersonalSpital() {
        return new Asistent();
    }
}