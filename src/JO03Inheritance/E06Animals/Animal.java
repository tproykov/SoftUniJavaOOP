package JO03Inheritance.E06Animals;

public class Animal {

    private static final String INVALID_INPUT = "Invalid input!";

    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(INVALID_INPUT);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException(INVALID_INPUT);
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (!gender.equals("Male") && !gender.equals("Female")) {
            throw new IllegalArgumentException(INVALID_INPUT);
        }
        this.gender = gender;
    }

    public String produceSound() {
        return null;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s %d %s\n%s", getClass().getSimpleName(),
                getName(), getAge(), getGender(), produceSound());
    }
}