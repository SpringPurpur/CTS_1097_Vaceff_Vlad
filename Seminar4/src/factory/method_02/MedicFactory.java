package factory.method_02;

public class MedicFactory extends PersonalSpitalFactoryMethod {
    @Override
    public PersonalSpital getPersonalSpital() {
        return new Medic();
    }
}