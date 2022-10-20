package InterfacesAndAbstraction.DefineIntefacePerson;

public class Pet implements Birthable, Nameable {
    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String getName() {
        return name;
    }
}
