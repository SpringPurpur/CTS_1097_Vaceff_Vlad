package factory.method_02;

public class BrancardierFactory extends PersonalSpitalFactoryMethod {
    @Override
    public PersonalSpital getPersonalSpital() {
        return new Brancardier();
    }
}