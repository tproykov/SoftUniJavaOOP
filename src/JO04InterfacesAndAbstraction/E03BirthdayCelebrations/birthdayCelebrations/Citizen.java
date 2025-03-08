package birthdayCelebrations;

public class Citizen implements Identifiable, Birthable {

    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getBirthDay() {
        return birthDate;
    }

    @Override
    public String getId() {
        return id;
    }
}